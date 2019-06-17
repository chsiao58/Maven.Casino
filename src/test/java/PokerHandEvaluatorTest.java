import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PokerHandEvaluatorTest {

    @Test
    public void straightFlushTestTrue()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));
        cards.add(new Card(1,Rank.ACE,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.NINE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SIX,Suit.CLUB));
        cards.add(new Card(1,Rank.TEN,Suit.DIAMOND ));
        Assert.assertTrue(PokerHandEvaluator.isStraight(cards));
    }

    @Test
    public void straightFlushTestFalse()
    {
        // this is just a straight
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.SEVEN,Suit.CLUB));
        cards.add(new Card(1,Rank.ACE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.NINE,Suit.CLUB));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.TWO,Suit.DIAMOND));
        cards.add(new Card(1,Rank.TEN,Suit.DIAMOND));
        Assert.assertFalse(PokerHandEvaluator.isStraight(cards));
    }

    @Test
    public void flushTestFalse()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.ACE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.ACE,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.HEART));
        cards.add(new Card(1,Rank.SIX,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SIX,Suit.CLUB));
        cards.add(new Card(1,Rank.KING,Suit.CLUB));
        Assert.assertFalse(PokerHandEvaluator.isFlush(cards));
    }

    @Test
    public void flushTestTrue()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.ACE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.ACE,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.TWO,Suit.DIAMOND));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SIX,Suit.CLUB));
        cards.add(new Card(1,Rank.KING,Suit.DIAMOND ));
        Assert.assertTrue(PokerHandEvaluator.isFlush(cards));
    }

    @Test
    public void straightTestFalse()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.ACE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.ACE,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.TWO,Suit.DIAMOND));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SIX,Suit.CLUB));
        cards.add(new Card(1,Rank.KING,Suit.DIAMOND ));
        Assert.assertFalse(PokerHandEvaluator.isStraight(cards));
    }

    @Test
    public void straightTestTrue()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.clear();
        cards.add(new Card(1,Rank.NINE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.TWO,Suit.CLUB));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.THREE,Suit.CLUB));
        cards.add(new Card(1,Rank.FIVE,Suit.DIAMOND));
        Assert.assertTrue(PokerHandEvaluator.isStraight(cards));
    }

    @Test
    public void PairTestTrue()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.clear();
        cards.add(new Card(1,Rank.NINE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.SPADE));
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));

        Assert.assertTrue(PokerHandEvaluator.isPair(cards));
    }

    @Test
    public void PairTestFalse()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.clear();
        cards.add(new Card(1,Rank.NINE,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.SPADE));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));

        Assert.assertFalse(PokerHandEvaluator.isPair(cards));
    }

    @Test
    public void TOTKTestTrue()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.clear();
        cards.add(new Card(1,Rank.SEVEN,Suit.CLUB));
        cards.add(new Card(1,Rank.SEVEN,Suit.SPADE));
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));

        Assert.assertTrue(PokerHandEvaluator.isThreeOfAKind(cards));
    }

    @Test
    public void TOTKTestFalse()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.clear();
        cards.add(new Card(1,Rank.SEVEN,Suit.CLUB));
        cards.add(new Card(1,Rank.SIX,Suit.SPADE));
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));

        Assert.assertFalse(PokerHandEvaluator.isThreeOfAKind(cards));
    }

    @Test
    public void FOTKTestTrue()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.SEVEN,Suit.CLUB));
        cards.add(new Card(1,Rank.SEVEN,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.HEART));

        Assert.assertTrue(PokerHandEvaluator.isFourOfAKind(cards));
    }
    @Test
    public void FOTKTestFalse()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.SEVEN,Suit.CLUB));
        cards.add(new Card(1,Rank.SEVEN,Suit.SPADE));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.HEART));

        Assert.assertFalse(PokerHandEvaluator.isFourOfAKind(cards));
    }

    @Test
    public void fullHouseTestTrue()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.SEVEN,Suit.CLUB));
        cards.add(new Card(1,Rank.TEN,Suit.CLUB));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.HEART));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));
        cards.add(new Card(1,Rank.TEN,Suit.DIAMOND));
        Assert.assertTrue(PokerHandEvaluator.isFullHouse(cards));
    }

    @Test
    public void fullHouseTestFalse()
    {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.SEVEN,Suit.CLUB));
        cards.add(new Card(1,Rank.TEN,Suit.CLUB));
        cards.add(new Card(1,Rank.SIX,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.HEART));
        cards.add(new Card(1,Rank.EIGHT,Suit.DIAMOND));
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));

        Assert.assertFalse(PokerHandEvaluator.isFullHouse(cards));
    }
}


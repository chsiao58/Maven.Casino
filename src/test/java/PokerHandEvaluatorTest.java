import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PokerHandEvaluatorTest {

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
}

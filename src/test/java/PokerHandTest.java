import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PokerHandTest {
    PokerHand pokerHand;

//        pokerHand = new PokerHand();

    @Test
    public void pokerHandSizeTest() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1,Rank.SEVEN,Suit.DIAMOND));
        cards.add(new Card(1,Rank.ACE,Suit.SPADE));

        PokerHand pokerHand = new PokerHand(cards);
        Assert.assertEquals(2, (int) pokerHand.numberOfCardsInHand());

    }
}
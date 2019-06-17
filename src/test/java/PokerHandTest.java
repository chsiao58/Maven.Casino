import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PokerHandTest {
    PokerHand pokerHand;
    @Before
    public void setUp()
    {
        ArrayList<Card> cards = new ArrayList<>();
        pokerHand = new PokerHand(cards);
    }
    @Test
    public void pokerHandSizeTest() {
        ArrayList<Card> cards = new ArrayList<>();
        PokerHand pokerHand = new PokerHand(cards);
    //    Assert.assertEquals(2, pokerHand.numOfCardInHand());
    }

    @Test
    public void pokerHandSize2Test() {
        ArrayList<Card> cards = new ArrayList<>();
        PokerHand pokerHand = new PokerHand(cards);
   //     Assert.assertEquals(2, pokerHand.numOfCardInHand());
    }

    @Test
    public void pokerUniqueTest() {
        // assuming only 1 deck
        ArrayList<Card> cards = new ArrayList<>();
        PokerHand pokerHand = new PokerHand(cards);
    //    Assert.assertnotEquals(pokerHand.getCards().get(0),pokerHand.getCards().get(1));
    }
}
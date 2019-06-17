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
<<<<<<< HEAD
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
=======
//        pokerHand = new PokerHand();
    }
    @Test
    public void pokerHandSizeTest() {
//        PokerHand pokerHand = new PokerHand();
        Assert.assertEquals(2, (int) pokerHand.numberOfCardsInHand());
>>>>>>> a37167eeb59fb7db66ca95050faf9a841e418cbb
    }

    @Test
    public void pokerUniqueTest() {
        // assuming only 1 deck
<<<<<<< HEAD
        ArrayList<Card> cards = new ArrayList<>();
        PokerHand pokerHand = new PokerHand(cards);
    //    Assert.assertnotEquals(pokerHand.getCards().get(0),pokerHand.getCards().get(1));
=======
 //       PokerHand pokerHand = new PokerHand();
 //       Assert.assertNotEquals(pokerHand.getCards().get(0),pokerHand.getCards().get(1));
>>>>>>> a37167eeb59fb7db66ca95050faf9a841e418cbb
    }
}
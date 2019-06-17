import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BlackJackTest {

    @Before
    public void setUp() throws Exception {
        ArrayList<Card> playerHand =  new ArrayList<>(5);
        Card card1 = new Card(1,Rank.TEN, Suit.CLUB);
        Card card2 = new Card(1,Rank.TEN, Suit.CLUB);
        playerHand.add(0,card1);
        playerHand.add(1,card2);
    }


    @Test
    public void canSplitTest(){

    }




    @Test
    public void endOfGame() {
    }
}
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import java.util.ArrayList;


public class PalacePlayerTest implements Dealer {

    PalacePlayer player;



    @Before
    public void setUp() throws Exception {
        PalacePlayer player = new PalacePlayer(new Person(200.0, "Greg", 29));

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void firstThreeTest() {

        //Dealer.dealCard;
        player.getCards();
        int expected = 3;
        int actual = player.getCards();
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void faceDownTest() {

        player.getHand();
            Assert.assertTrue(PalaceHand.FaceDown);

    }

    @Test
    public void firstSixTest() {
        //Card card = house.dealCard();
       // Dealer dealCard();
        int expected = 6;
        int actual = player.getCards();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void threeFaceUpTest() {
        ArrayList<Card> palaceHandUp = new ArrayList<Card>(3);
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        palaceHandUp.add(0, card1);
        palaceHandUp.add(1, card2);
        palaceHandUp.add(2, card3);
        int expected = 3;
        int actual = palaceHandUp.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void faceUpTest() {



        //for (card:PalaceHand) {

            Assert.assertTrue(PalaceHand.FaceUp);


    }

    @Test
    public void playingHandTest() {

        int expected = 3;
        int actual = player.getHand();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public boolean ValidMoveTest() {
        return true;

    }

    @Test
    public void takePileTest() {

       // PalaceHand.add(discard);
    }


    @Test
    public void drawTest() {

        Assert.assertEquals(2, player.getCards());

    }

    @Test
    public void playFaceUp() {
        player.getHand();
        int expected = 0;

        Assert.assertTrue(PalaceHand.FaceUp);
    }


    @Test
    public void takeTurnTest() {


    }

    @Test
    public void leaveGame() {

    }

    @Override
    public Card dealCard() {
        return null;
    }

    @Override
    public void shuffle() {

    }

}

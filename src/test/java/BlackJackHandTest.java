import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BlackJackHandTest {


    @Test
    public void sumHand() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(0, Rank.TWO, Suit.DIAMOND));
        cards.add(new Card(1, Rank.THREE, Suit.DIAMOND));
        cards.add(new Card(1, Rank.FOUR, Suit.HEART));
        cards.add(new Card(1, Rank.EIGHT, Suit.SPADE));
        BlackJackHand hand = new BlackJackHand(cards);
        Integer expected = 17;
        Integer actual = hand.sumHand();
        assertEquals(expected, actual);
    }
}
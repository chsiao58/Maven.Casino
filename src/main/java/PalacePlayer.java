import java.util.ArrayList;

public class PalacePlayer implements Dealer{

    Hand hand;

    public PalacePlayer(Person player) {
        ArrayList<Card> cards = new ArrayList<>();
        this.hand = new PalaceHand(cards);
    }


    @Override
    public Card dealCard() {
        return null;
    }

    @Override
    public void shuffle() {

    }
}

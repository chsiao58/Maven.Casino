import java.util.ArrayList;
import java.util.Collections;

public class PalaceNPC implements Dealer{

    private PalaceHand hand;
    private Decks decks;

    public PalaceNPC(Decks decks) {
        this.decks = decks;
    }

    public void dealHand() {

    }
    public void initializeHand() {

    }

    @Override
    public Card dealCard() {
        return decks.getCards().remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(decks.getCards());
    }


}

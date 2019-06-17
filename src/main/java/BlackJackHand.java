import java.lang.reflect.Array;
import java.util.ArrayList;

public class BlackJackHand extends Hand {


    public BlackJackHand(ArrayList<Card> cards) {
        super(cards);
    }

    public Integer sumHand(){
        int sumHand = 0;
        for (int i = 0; i < super.cards.size(); i++) {
            if(cards.get(i).getRankNumber() != null) {
                sumHand  += cards.get(i).getRankNumber();
            }
        }
        return sumHand;
    }
}

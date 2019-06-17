

import java.util.ArrayList;

public class Palace extends CardGame {

//    PileOfCards deck = new PileOfCards();
    PileOfCards discard;

    public Palace (Player player , Integer numberOfDecks) {
        super(player, numberOfDecks);

    }


    public Boolean didWin(Player player) {return false;}
    public void playGame() {}
    public void endOfGame() {}
}


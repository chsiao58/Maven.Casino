
import java.util.ArrayList;
import java.util.List;


public class Poker extends CardGame{

    List<Card> communityCard;
    List<PokerTurn> turns;
    Integer pool;

<<<<<<< HEAD
    public Poker(PokerPlayer[] players) {
=======
    public Poker(Player players) {
>>>>>>> bfc89ff9c933edd992bc00d9f83fdd17f08c4349
        super(players, 1);
        turns = new ArrayList<>();
    }

    public Boolean didWin(Player player) {return false;}

    public Boolean isSomeoneWon() {return false;}

    public void playGame() {
        while (!isSomeoneWon()) {
            PokerTurn turn = new PokerTurn();

            // while no one wins
            // create Turn
        }

    }
    public void endOfGame() {
        // change seat if keep playing??
    }

    public List<PokerTurn> getPlayHistory()
    {
        return turns;
    }
}

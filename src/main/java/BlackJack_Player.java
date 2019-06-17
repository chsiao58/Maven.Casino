import exceptions.NegativeBetException;

import java.util.ArrayList;

public class BlackJack_Player extends Player implements Gambling {


    Integer bet;


    public BlackJack_Player(Person player) {
        super(player);
    }

    public Boolean didWin() {
        return false;
    }

    public void makeMove() {
    }


    public Boolean canSplit() {
        ArrayList<Card> playerHand = new ArrayList<>(5);
        if (playerHand.get(0) == playerHand.get(1)) {
            System.out.println("Would you like to split?");
            return true;
        }
        return false;
    }
//    public void split() {
//        if (chipCount >= 2){
//            bet();
//        }
//}
    public void hitOrStay() {}
    public void doubleDown() {}
    public void leaveGame(){}


    @Override
    public Integer bet(Integer numOfChipsToBet) throws NegativeBetException {
        return null;
    }
}

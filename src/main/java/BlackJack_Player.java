import exceptions.NegativeBetException;

import java.util.ArrayList;

public class BlackJack_Player extends Player implements Gambling {


    Integer bet;
    Integer sumHand = 0;



    public BlackJack_Player(Person player) {
        super(player);
    }

    public Boolean didWin() {
        return false;
    }

    public void makeMove() {
    }


     public Integer bet (Integer numOfChipsToBet) throws NegativeBetException {

            return 0;
        }
    }
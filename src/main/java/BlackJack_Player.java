import exceptions.NegativeBetException;

import java.util.ArrayList;

public class BlackJack_Player extends Player implements Gambling {

    private Person player;
    Integer bet;
    Integer sumHand = 0;



    public BlackJack_Player(Person player) {
        super(player);
    }

<<<<<<< HEAD
    public Boolean didWin(){ return false;}
    public void makeMove(){}
    public void leaveGame(){}
  /*  public Boolean canSplit(){

        if(playerHand.get(0) == playerHand.get(1)){
            return true;
        }
        return false;}*/
    public void split() {}
    public void hitOrStay() {}
    public void doubleDown() {}

    @Override
    public Integer bet(Integer numOfChipsToBet) {
        return null;
    }
}
=======

>>>>>>> ada73ca9ac4742d37a82da0884bebf26e8ff6d52

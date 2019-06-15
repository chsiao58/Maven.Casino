import java.util.ArrayList;

public class DolioStyleCraps extends DiceGame {
    public DolioStyleCraps(DStyleCrapsPlayer[] players) {
       super(players, 2);
   }


    public void playGame() {
        ((DStyleCrapsPlayer) players[0]).roll(dice);
    }

    public Boolean didWin(DStyleCrapsPlayer player) {
       if(dice.sum()==7||dice.sum()==11)
           return true;
       else if(dice.sum()==2)
           return false;
       else
           playGame();
        return false;
       }

    public void endOfGame() {
        boolean keepRolling=true;
        boolean value=didWin((DStyleCrapsPlayer )players[0]);
        while(keepRolling) {
            if(dice.sum()==7||dice.sum()==11)
                keepRolling=false;
            else if(dice.sum()==2)
                keepRolling=false;
            else
                playGame();
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class DolioStyleCraps extends DiceGame {

    Scanner in=new Scanner(System.in);
    ArrayList<Integer> pointList=new ArrayList<>();
    public DolioStyleCraps(DStyleCrapsPlayer players) {
        super(players, 2);
   }


    @Override
    public void playGame() {
        ((DStyleCrapsPlayer) players).roll(dice);
        System.out.println("Player rolled "+dice.tossAndSum());
    }


    public Boolean didWin(DStyleCrapsPlayer player) {
       if(dice.sum()==7||dice.sum()==11||pointList.contains(dice.sum())){
          // House house=new House(2);
         //  player.earnedChips(house.payout(player.betchips));
           return true;
       }
       else if(dice.sum()==2||dice.sum()==12||dice.sum()==3)
           return false;
       else
           playGame();
        return false;
       }

    @Override
    public void endOfGame() {
        boolean keepRolling=true;
        while(keepRolling) {
            if(dice.sum()==7||dice.sum()==11){
                System.out.println("Player won the game");
                keepRolling=false;}
            else if(dice.sum()==2||dice.sum()==12||dice.sum()==3){
                System.out.println("Player lost the game");
                keepRolling=false;}
            else if(pointList.contains(dice.sum())){
                System.out.println("Player won the game rolled "+dice.sum());
                keepRolling=false;
            }
            else{
                pointList.add(dice.sum());
                System.out.println("Keep Playing");
                System.out.println("Press [Enter] to roll the dice");
               in.nextLine();
                playGame();}
        }
    }
}

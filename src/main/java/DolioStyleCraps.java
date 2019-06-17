import java.util.ArrayList;

public class DolioStyleCraps extends DiceGame {


    private ArrayList<Integer> pointList;


    public DolioStyleCraps(DStyleCrapsPlayer[] players) {
        super(players, 2);
        pointList = new ArrayList<>();
    }

    public DolioStyleCraps(DStyleCrapsPlayer player) {
        super(player, 2);
        pointList = new ArrayList<>();
    }


    public void playGame() {

       super.getDice().toss();
        System.out.println("Player rolled "+dice.tossAndSum());
    }

    public Boolean didWin() {
       if(dice.sum()==7||dice.sum()==11)
           return true;
       else if(dice.sum()==2)
           return false;
       else
           playGame();
        return false;
       }

    public void endOfGame() {

        if(didWin())
            System.out.println("Player "+player+" won the game");
        else if(!didWin())
            System.out.println("Player "+player+" lost the game");
        else
            playGame();


        boolean keepRolling=true;
        while(keepRolling) {
            if(dice.sum()==7||dice.sum()==11){
                System.out.println("Player won the game! Congratulations...");
                keepRolling=false;}
            else if(dice.sum()==2||dice.sum()==12||dice.sum()==3){
                System.out.println("Player lost the game,GoodLuck next time...");
                keepRolling=false;}
            else if(pointList.contains(dice.sum())){
                System.out.println("Player won the game rolled "+dice.sum());
                keepRolling=false;
            }
            else{
                pointList.add(dice.sum());
                System.out.println("Keep Playing");
                System.out.println("Press [Enter] to roll the dice");
           //    in.nextLine();
                playGame();}
        }

    }
}


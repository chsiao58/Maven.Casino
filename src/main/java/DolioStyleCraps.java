import java.util.ArrayList;

public class DolioStyleCraps extends DiceGame {
<<<<<<< HEAD
    public DolioStyleCraps(DStyleCrapsPlayer[] players) {
       super(players, 2);
=======
    public DolioStyleCraps(Player players, Integer numberOfDice) {
        super(players, numberOfDice);
    }




    ArrayList<Integer> pointList=new ArrayList<>();
    public DolioStyleCraps(DStyleCrapsPlayer players) {
        super(players, 2);
>>>>>>> ada73ca9ac4742d37a82da0884bebf26e8ff6d52
   }


    public void playGame() {
<<<<<<< HEAD
        ((DStyleCrapsPlayer) players[0]).roll(dice);
=======
       super.getDice().toss();
        System.out.println("Player rolled "+dice.tossAndSum());
>>>>>>> ada73ca9ac4742d37a82da0884bebf26e8ff6d52
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
<<<<<<< HEAD
        if(didWin((DStyleCrapsPlayer)players[0])==true)
            System.out.println("Player "+players[0]+" won the game");
        else if(didWin((DStyleCrapsPlayer)players[0])==false)
            System.out.println("Player "+players[0]+" lost the game");
        else
            playGame();
=======

        if(didWin((DStyleCrapsPlayer) players[0]))
            System.out.println("Player "+players[0]+" won the game");
        else if(!didWin((DStyleCrapsPlayer) players[0]))
            System.out.println("Player "+players[0]+" lost the game");
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

>>>>>>> ada73ca9ac4742d37a82da0884bebf26e8ff6d52
    }
    }


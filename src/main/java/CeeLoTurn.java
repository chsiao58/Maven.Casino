import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CeeLoTurn extends Turn {
    private Dice dice;
    private Integer winningNumber;
    private Console console;
    private Boolean playerWon;

    public CeeLoTurn(Dice dice) {
        this.dice = dice;
    }

    public CeeLoTurn(Dice dice, Console console) {
        this.dice = dice;
        this.console = console;
        playerWon = false;
    }

    public void move(){  }

    public Integer roll() {
        return dice.tossAndSum();
    }
    public Integer compare(){return 1;}

    public boolean checkWin(){
        return true;
    }

    public Boolean checkDouble(Integer[] dice) {
        if (dice == null) return false;
        Integer firstDie = dice[0];
        Integer secondDie = dice[1];
        Integer thirdDie = dice[2];
        if (firstDie == secondDie){
            console.println(String.format("Double rolled. Number to win: %d", thirdDie));
            setNumber(thirdDie);
            return true;
        } else if (secondDie == thirdDie) {
            console.println(String.format("Double rolled. Number to win: %d", firstDie));
            setNumber(firstDie);
            return true;
        } else if (firstDie == thirdDie) {
            console.println(String.format("Double rolled. Number to win: %d", secondDie));
            setNumber(secondDie);
            return true;
        }
        return false;
    }

    private void setNumber(Integer thirdDie) {
        winningNumber = thirdDie;
    }

    public Boolean checkTriple(Integer[] dice) {
        if (dice == null) return false;
        Arrays.sort(dice);
        Integer firstDie = dice[0];
        Integer secondDie = dice[1];
        Integer thirdDie = dice[2];
        if ((firstDie == 4) && (secondDie == 5) && (thirdDie == 6)) {
            console.println("That was a winning roll.");
            playerWon = true;
            return true;
        }
        if ((firstDie == 1) && (secondDie == 2) && (thirdDie == 3)) {
            console.println("That was a losing roll");
            playerWon = false;
            return true;
        }
        return false;
    }

    @Override
    Boolean validMove() {
        return null;
    }

    public void play() {
        roll();
        Boolean dub = checkDouble(dice.getDice());
        Boolean trip = checkTriple(dice.getDice());
        while (!(dub | trip)) {
            roll();
            dub = checkDouble(dice.getDice());
            trip = checkTriple(dice.getDice());
        }
    }

    public boolean getWinner() {
        return playerWon;
    }
}

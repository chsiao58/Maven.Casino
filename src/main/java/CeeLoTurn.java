import java.util.ArrayList;

public class CeeLoTurn extends Turn {
    private Dice dice;

    public CeeLoTurn(Dice dice) {
        this.dice = dice;
    }

    public void move(){  }
    public Integer roll() {return  0;}
    public Integer compare(){return 1;}
    public boolean checkWin(){return true;}
    public Boolean checkDouble(Integer[] dice) {
        return false;
    }

    public Boolean checkTriple(Integer[] dice) {
        return false;
    }

    @Override
    Boolean validMove() {
        return null;
    }
}

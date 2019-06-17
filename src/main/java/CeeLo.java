import java.util.ArrayList;

public class CeeLo extends DiceGame {
   private Double pool;

   public CeeLo(CeeLoPlayer ...player) {
      super(player, 3);
   }

   public void takeTurn( ){}
   public void setNumber(){}
   public Integer getNumberToBeat(Integer[] numberToBeat){
       return 0;
   }

   Boolean didWin(Integer[] player) {
      return null;
   }

   protected void playGame() {


   }

   protected void endOfGame() {

   }

   public Double getPool() {
      return pool;
   }


}

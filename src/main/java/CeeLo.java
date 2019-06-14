public class CeeLo extends DiceGame {

   private Integer numToBeat = 0;
   private Integer pool;

   public CeeLo(CeeLoPlayer[] players) {
      super(players, 1);
   }

   public void takeTurn( ){


   }



   public Integer getNumToBeat() {
      return numToBeat;
   }

   public void setNumToBeat(Integer numToBeat) {


      this.numToBeat = numToBeat;
   }

   public Integer getCurrentRoll(Integer[] dice){
      Integer currentRoll;

         if (dice[0] == dice[1] ){
            currentRoll = dice[2];

         }
         else if( dice[0] == dice[2]){
            currentRoll= dice[1];
         }
         else if(dice[1] == dice[2]){
            currentRoll = dice[0];
         }
         currentRoll = -1;

       return currentRoll;
   }

   Boolean didWin(Integer[] Move) {
      return null;
   }

   void playGame() {

   }

   Boolean endOfGame() {

      return null;
   }

   public Boolean checkDouble(Integer[] dice) {

      return null;
   }

   public Boolean checkTriple(Integer[] dice) {

      return null;
   }

   public Boolean checkWinNumToBeat() {


     return null;
   }
}

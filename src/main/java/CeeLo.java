public class CeeLo extends DiceGame {

   private Integer numToBeat = -1;
   private Integer pool;
   private Integer currentRoll;
   private Integer opponentsRoll = -1;
   private Integer betAmount;

   public CeeLo(Player player) {
      super(player, 3);
   }

   public CeeLo(CeeLoPlayer... player) {
      super(player, 3);
   }

   public void takeTurn() {


   }


   public Integer getNumberToBeat(Integer[] dice) {


      return numToBeat;

   public CeeLo(CeeLoPlayer players) {
         super(players, 3);

      }

      public void setNumToBeat(Integer numToBeat){
         this.numToBeat = numToBeat;
      }

      public Integer getCurrentRoll (Integer[]dice){
         Integer currentRoll;

         if (dice[0] == dice[1]) {
            currentRoll = dice[2];

         } else if (dice[0] == dice[2]) {
            currentRoll = dice[1];
         } else if (dice[1] == dice[2]) {
            currentRoll = dice[0];
         } else
            currentRoll = -1;

         return currentRoll;
      }

      Boolean didWin (Integer[]Move){
         return null;
      }

      public void playGame () {
         while (numToBeat == -1) {
            dice.tossAndSum();
            numToBeat = getCurrentRoll(dice.getDice());
         }
         while (opponentsRoll == -1) {
            dice.tossAndSum();
            opponentsRoll = getCurrentRoll(dice.getDice());
         }
         if (opponentsRoll < numToBeat) {

         }


      }

      void endOfGame () {
      }

      public Boolean checkDouble (Integer[]dice){


         return null;
      }

      public Boolean checkTriple (Integer[]dice){
         return false;
      }

      public Boolean checkWinNumToBeat () {


         return null;
      }
   }
}
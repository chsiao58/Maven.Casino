import java.util.ArrayList;

public class CeeLo extends DiceGame {
   private Double pool;
   private Console console;
   private Boolean gameOver;
   private Boolean playerWins;

   public CeeLo(CeeLoPlayer ...player) {
      super(player, 3);
   }

   public CeeLo(CeeLoPlayer player, Console console) {
      super(player, 3);
      this.console = console;
      this.pool = 0.0;
      playerWins = false;
      gameOver = false;

   }

   public void takeTurn( ){}

   public void setNumber(){}

   public Integer getNumberToBeat(Integer[] numberToBeat){
       return 0;
   }

   Boolean didWin() {
      return null;
   }

   @Override
   void playGame() {
      Boolean gameStarted = startGame();
      if (!gameStarted) return;
      while (!gameOver) {
         console.println("Computer goes first.");
         CeeLoTurn compTurn = new CeeLoTurn(super.dice, console);
         if (compTurn.getWinner()) {
            gameOver = true;
            break;
         }
         console.println("Your turn now.");
         CeeLoTurn playerTurn = new CeeLoTurn(super.dice, console);
         playerTurn.play();
         if (playerTurn.getWinner()) {
            gameOver = true;
            break;
         }
      }
      endOfGame();

   }

   protected Boolean startGame() {
      Double bet = console.getDoubleInput("How much are you betting today?");
      Double playerWallet = player.getPerson().getWallet();
      if (bet > playerWallet) {
         console.println("You don't have that much money! Get out of here.");
         return false;
      } else {
         pool += bet;
         player.getPerson().setWallet(playerWallet - bet);
         console.println("Another player joins the game and bets 50 bucks.");
         pool += 50;
         console.println(String.format("The total pool is : %.2f", pool));
      }
      return  true;
   }

   protected void endOfGame() {
      if (playerWins) {
         console.println("You won! You get %d dollars. Don't come again please.", pool);
         Double playerWallet = player.getPerson().getWallet();
         player.getPerson().setWallet(playerWallet + pool);
      } else console.println("The other guy wins. Sucks to be you.");
      pool = 0.0;

   }

   public Double getPool() {
      return pool;
   }


}

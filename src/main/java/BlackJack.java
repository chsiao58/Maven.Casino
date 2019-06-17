import java.util.ArrayList;

public class BlackJack extends CardGame {


Integer sumHand = 0;

    @Override
    void playGame() {

    }

    @Override
    void endOfGame() {

    }


    public BlackJack(BlackJack_Player players, Integer numberOfDecks) {
        super(players, numberOfDecks);
    }


    Decks blackJackDeck = new Decks(5);
    House house = new House(2, blackJackDeck);


    public void playGame(){
        while(!checkWin()){
            System.out.println("Welcome to the BlackJack table. How many chips would you like?");
            house.moneyToChips(50.00);
            house.takeBets(2);
            house.shuffle();
            house.dealCard(1).isFaceUpToMe();
            house.dealCard(1).isFaceUpToEveryone();




        }

    }
    Hand playerHand = new Hand() {
        @Override
    public Integer numberOfCardsInHand() {
            return super.numberOfCardsInHand();
        }
    };

    public Boolean checkWin(){
       if (playerHand.)



        return false;
    }


    public Integer HandSum(Hand hand){
         for (int i = 0; i < 5; i++) {
             if(hand.card.getRank() != null){

               sumHand  += playerHand.get(i).getValue();
             }

         }return sumHand;
     }
    public Boolean didWin(Player player) {return false;}

}

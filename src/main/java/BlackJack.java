
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack extends CardGame {
    private BlackJackHand playerHand;
    private BlackJackHand dealerHand;
    private Integer chipCount;
    private House house;
    private Scanner input = new Scanner(System.in);
    private Boolean gameOver;

    public BlackJack(BlackJack_Player players, Integer numberOfDecks) {
        super(players, numberOfDecks);
        this.playerHand = new BlackJackHand(new ArrayList<>(5));
        this.dealerHand = new BlackJackHand(new ArrayList<>(5));
        Decks blackJackDeck = new Decks(5);
        this.chipCount = 0;
        this.house = new House(2, blackJackDeck);
        this.gameOver = false;
    }




    public void playGame() {
        while (!gameOver) {
            System.out.println("Welcome to the BlackJack table.");
            input.nextInt(Integer.parseInt("How many chips would you like?"));
            Chips playerChips = new Chips(house.moneyToChips(50.00) / 5);
            System.out.println("Place your bet!");
            System.out.println("Last call...All bets in. Good luck!");
            house.takeBets(2);
            //End of first round of betting and Ante

            house.shuffle();

            Card card = house.dealCard();
            card.setFaceUpToMe();
            playerHand.addCard(card);

            Card card2 = house.dealCard();
            card2.setFaceDownToEveryone();
            playerHand.addCard(card2);

            Card card3 = house.dealCard();
            card3.setFaceUpToEveryone();
            playerHand.addCard(card3);

            Card card4 = house.dealCard();
            card4.setFaceUpToEveryone();
            dealerHand.addCard(card4);

            checkWin();

            input.nextInt(Integer.parseInt("Would you like to Hit?"));


            Card card5 = house.dealCard();
            card5.setFaceUpToEveryone();
            dealerHand.addCard(card5);
            checkWin();
            input.nextInt(Integer.parseInt("Would like another hit or would you like to stay?"));

        }
    }



    void endOfGame() {
        input.nextInt(Integer.parseInt("Are you sure you'd like to quit?"));
    }

    public String checkWin() {
        if (playerHand.sumHand() > 21) {
            gameOver = true;
            return "Awww...too bad. You BUSTED!";
        }
        if (playerHand.sumHand().equals(dealerHand.sumHand())) {
            return "All tied up...it's a push.";
        }
        if (playerHand.sumHand() > dealerHand.sumHand() && playerHand.sumHand() <= 21) {
            gameOver = true;
            return "Congratulations Player 1, you've won!";
        }
        return "You shouldn't be here!";
    }


    public Boolean canSplit() {
        if (playerHand.getCards().get(0) == playerHand.getCards().get(1)) {
            System.out.println("Would you like to split?");
            return true;
        }
        return false;
    }

//    public void split() {
//        if (chipCount >= 2) {
//            bet();
//            house.dealCard(2);
//        }
//
//        public void hitOrStay(){
//            if (playerHand.sumHand() <= 21) {
//            }
//            house.dealCard(1);
//        }
//
//
//        public void doubleDown () {
//            bet(2);
//        }
//        public void leaveGame () {
//        }


//        public Integer bet (Integer numOfChipsToBet) throws NegativeBetException {
//
//            return 0;
//        }


    }

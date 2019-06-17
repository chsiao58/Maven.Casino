import sun.jvm.hotspot.utilities.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJack extends CardGame {


    public BlackJack(BlackJack_Player players, Integer numberOfDecks) {
        super(players, numberOfDecks);
    }


    private Decks blackJackDeck = new Decks(5);
    private House house = new House(2, blackJackDeck);
    private ArrayList<Card> playersHand = new ArrayList<>(5);
    private ArrayList<Card> houseHand = new ArrayList<>(5);
    private Hand playerHand;
    private Hand dealerHand;
    private Hand split;
    Integer chipCount = 0;
    private Scanner input = new Scanner(System.in);


    public void playGame() {
        while (!checkWin()) {
            System.out.println("Welcome to the BlackJack table.");
            input.nextInt(Integer.parseInt("How many chips would you like?"));
            Chips playerChips = new Chips(house.moneyToChips(50.00) / 5);
            System.out.println("Place your bet!");
            System.out.println("Last call...All bets in. Good luck!");
            house.takeBets(2);
            //End of first round of betting and Ante

            house.shuffle();

            house.dealCard(1).isFaceUpToMe();
            playerHand.getCards().add();

            house.dealCard(1).isFaceDownToEveryone();
            dealerHand.addCard();

            house.dealCard(1).isFaceUpToEveryone();
            playersHand.add();



            house.dealCard(1).isFaceUpToEveryone();
            dealerHand
            checkWin();
            input.nextInt(Integer.parseInt("Would you like to Hit?"));


            house.dealCard(1).isFaceUpToEveryone();
            checkWin();
            input.nextInt(Integer.parseInt("Would like another hit or would you like to stay?"));

        }
    }


    void endOfGame() {
        input.nextInt(Integer.parseInt("Are you sure you'd like to quit?"));
    }

    public String checkWin() {
        if (playerHand.sumHand() > 21) {
            return "Awww...too bad. You BUSTED!";
        }

        if (playerHand.sumHand() == dealerHand.sumHand()) {

            return "All tied up...it's a push.";
        }
        if (playerHand.sumHand() > dealerHand.sumHand() && playerHand.sumHand() <= 21) {
            return "Congratulations Player 1, you've won!";
        }




    }public Boolean canSplit() {
        ArrayList<Card> playerHand = new ArrayList<>(5);
        if (playerHand.get(0) == playerHand.get(1)) {
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

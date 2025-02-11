import exceptions.NegativeBetException;
import exceptions.NotEnoughChipException;

import java.util.ArrayList;

public class PokerPlayer extends Player implements Gambling {

    private PokerHand hand;

    private Boolean folded = false;
    private Integer chips = 0;

    public PokerPlayer(Person p) {
        super(p);
    }

    public void setHand(ArrayList<Card> cards) {
        hand = new PokerHand(cards);
    }

    public Integer call(Integer lastPlayerBet) {
        return bet(lastPlayerBet);
    }

    public Integer check() {return call(0);}

    public void fold() {
        folded = true;
    }
    public void getReady() { folded = false; }


    public Integer raise(Integer lastPlayerBet, Integer amountToRaise) throws NegativeBetException {
        if (amountToRaise < 0)
            throw new NegativeBetException();
        return bet(lastPlayerBet + amountToRaise);
    }

    public Integer smallBlind() {
        return bet(1);
    }

    public Integer bigBlind() {
        return bet(2);
    }

    public Boolean isFolded() {
        return folded;
    }

    public Integer getChip() {
        return chips;
    }

    public void setChips(Integer chips) {
        this.chips = chips;
    }

    public void addChips(Integer chips) { this.chips += chips; }

    public Integer bet(Integer numOfChipsToBet) throws NegativeBetException, NotEnoughChipException {
        if (numOfChipsToBet < 0)
            throw new NegativeBetException();
        if(numOfChipsToBet > chips)
            throw new NotEnoughChipException("Not enough Chips");
        chips -= numOfChipsToBet;
        return numOfChipsToBet;
    }

    public Integer getBetFromAction(Console console, Integer lastBet) {
        while(true) {
        Integer choice = console.getIntegerInput("1. Call  2. Raise  3. Fold");
        if (choice == 1) return call(lastBet);
        else if (choice == 2) return raise(lastBet, console.getIntegerInput("How much?"));
        else if (choice == 3) {fold(); return null;}
        }
    }

    public PokerHand getHand() {return hand;}
}

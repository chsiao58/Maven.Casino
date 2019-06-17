import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker extends CardGame {

    private ArrayList<Card> communityCard;
    private Integer pool = 0;
    private Integer lastBet = 0;
    private Integer sameBetCount = 0;
    private List<PokerPlayer> pokerPlayerList;  // to store all player
    private Console console;
    private House house;

    public Poker(PokerPlayer player, Console console) {
        super(player, 1);
        this.console = console;
        house = new House(5,decks);
        communityCard = new ArrayList<>();
        pokerPlayerList = new ArrayList<>();
        pokerPlayerList.add(player);
        for (Integer index = 1; index < 4; index++)
            pokerPlayerList.add(new PokerNPC(new Person(300.0, "Computer " + index, 21)));

        //----- for debugging
        for (PokerPlayer p: pokerPlayerList)
            p.addChips(500);
    }

    public void playGame() {
        house.shuffle();
        communityCard = new ArrayList<>();
        while (!onePlayerStanding() && !showDownTime()) {
            initializeBet();
            determineTurnToPlay();
        }
        PokerPlayer winner = showDown();
        awardPool(winner);
        endOfGame();
    }

    protected void determineTurnToPlay() {
        if (communityCard.size() == 0)
            preFlop();
        else
            postFlop();
    }

    protected void preFlop() {
        update(pokerPlayerList.get(0).smallBlind());
        update(pokerPlayerList.get(1).bigBlind());
        dealCardToAllPlayer();
        startBetting(2);
        flop();
    }

    protected void flop() {
        for (int i = 0; i < 2; i++)
            communityCard.add(house.dealCard());
    }

    protected void dealCardToAllPlayer() {
        for (PokerPlayer player : pokerPlayerList){
            ArrayList<Card> twoCard = new ArrayList<>();
            twoCard.add(house.dealCard());
            twoCard.add(house.dealCard());
            player.setHand(twoCard);
        }
    }


    protected void postFlop() {
        communityCard.add(house.dealCard());
        startBetting(0);
    }

    protected PokerPlayer showDown() {
        // make an array of everyone's point
        // for each player
        // determine the point they got by add communityCard + player hand
        // send it to evaluate
        // return winner


        return pokerPlayerList.get(0);
    }

    protected Boolean showDownTime() {
        return communityCard.size() >= 5;
    }

    protected void startBetting(Integer startingPlayerIndex) {
        Integer currentPlayerIndex = startingPlayerIndex;

        // keep betting when everyone hasn't bet same
        // and when there is still 2 or more unfolded player
        while(!onePlayerStanding() && !everyoneBetSame()) {
            if (!isNPC(pokerPlayerList.get(currentPlayerIndex))) {
                console.println("Pool: " + pool);
                console.println(communityCard.toString());
                console.println(pokerPlayerList.get(currentPlayerIndex).getHand().getCards().toString());
            }
            if (!pokerPlayerList.get(currentPlayerIndex).isFolded())
                update(pokerPlayerList.get(currentPlayerIndex).getBetFromAction(console, lastBet));

            currentPlayerIndex++;
            if (currentPlayerIndex >= pokerPlayerList.size())
                currentPlayerIndex = 0;
        }
    }

    protected void initializeBet() {
        lastBet = 0;
        sameBetCount = 0;
    }

    protected void update(Integer betFromAction) {
        if (betFromAction != null) {
            updatePool(betFromAction);
            updateSameBetCount(betFromAction);
            updateLastBet(betFromAction);
        }
    }

    protected void updatePool(Integer betFromAction) {
        pool += betFromAction;
    }


    protected void updateSameBetCount(Integer betFromAction) {
        if (betFromAction.equals(lastBet))
            sameBetCount++;
        else
            sameBetCount = 0;
    }

    protected void updateLastBet(Integer betFromAction) {
        lastBet = betFromAction;
    }

    protected Boolean isNPC(PokerPlayer player) {
        return player instanceof PokerNPC;
    }

    protected Integer getNumOfFoldedPlayer()
    {
        Integer numOfFoldedPlayer = 0;
        for (PokerPlayer pokerPlayer : pokerPlayerList)
            if (pokerPlayer.isFolded())
                numOfFoldedPlayer++;

        return numOfFoldedPlayer;
    }

    protected Boolean onePlayerStanding() {

        return getNumOfFoldedPlayer() == pokerPlayerList.size()-1;
    }

    protected Boolean everyoneBetSame() {
        return sameBetCount == pokerPlayerList.size() - getNumOfFoldedPlayer();
    }

    protected void awardPool(PokerPlayer winner) {
        console.println(winner.person.getName() + " won " +pool+" chips!");
        winner.addChips(pool);
        pool = 0;
    }


    protected void endOfGame() {
        // ask if keep playing
        // if keep playing
        // reset bet
        // change seat
        // call playGame

        String input = console.getStringInput("Keep Playing? Y/N");
        if (input.equalsIgnoreCase("y"))
            playGame();
        else
            console.println("you have "+ pokerPlayerList.get(0).getChip() + " chips in total.");
    }

    public List<Card> getCommunityCard() {
        return Collections.unmodifiableList(communityCard);
    }

    public Integer getPool() {
        return pool;
    }

    public Integer getLastBet() {
        return lastBet;
    }

    public Integer getSameBetCount() {
        return sameBetCount;
    }

    public List<PokerPlayer> getPokerPlayerList() {
        return Collections.unmodifiableList(pokerPlayerList);
    }

    public Console getConsole() {
        return console;
    }

    public House getHouse() {
        return house;
    }

}

public class Poker extends CardGame{
    public Poker(Player[] players, Integer numberOfDecks) {
        super(players, numberOfDecks);
    }

    public Boolean didWin(Player player) {return false;}
    public void playGame() {}
    public Boolean endOfGame() {
        return null;
    }
}

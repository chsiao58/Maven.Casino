import java.util.ArrayList;

abstract class CardGame extends Game{

    protected Decks decks;

    public CardGame(Player[] players, Integer numberOfDecks) {
        super(players);
        this.decks = new Decks(numberOfDecks);
    }

    public CardGame(Player players, Integer numberOfDecks) {
        super(players);
        this.decks = new Decks(numberOfDecks);
    }

}

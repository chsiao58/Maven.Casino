import java.util.ArrayList;

public abstract class Hand {
    private  ArrayList<Card> cards;
    private Integer sumHand;

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void sort() {
        CardComparator comparator = new CardComparator();
        cards.sort(comparator);
    }

    public void addCard(Card newCard) {
        cards.add(newCard);
    }

    public Card[] playCard(int ...index) {
        Card[] cardsToPlay = new Card[index.length];
        int count = 0;
        for (int i : index) cardsToPlay[count] = cards.remove(i);
        return cardsToPlay;
    }

    public Integer numberOfCardsInHand() {
        return cards.size();
    }

    public Integer sumHand(){
        for (int i = 0; i < 5; i++) {
            if(cards.get(i).getRankNumber() != null){

                sumHand  += cards.get(i).getRankNumber();
            }

        }return sumHand;

    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerHandEvaluator {

 //   STRAIGHT_FLUSH  (2), X
 //   FOUR_OF_A_KIND  (3), good
 //   FULL_HOUSE      (4), X
 //   FLUSH           (5), good
 //   STRAIGHT        (6), good
 //   THREE_OF_A_KIND (7), good
 //   TWO_PAIR        (8), X
 //   PAIR            (9), good

    public static Boolean isStraightFlush(ArrayList<Card> cards) { //
        // TODO: change this obviously wrong code
        return isFlush(cards) && isStraight(cards);
    }

    public static Boolean isFourOfAKind(ArrayList<Card> cards) {
        return isRepeatRank(cards,4);
    }

    public static Boolean isFullHouse(ArrayList<Card> cards) {
        // TODO: change this obviously wrong code
        return isThreeOfAKind(cards) && isPair(cards);
    }


    public static Boolean isFlush(ArrayList<Card> cards)
    {
            for (Suit suit : Suit.values()){
                Integer suitCount = 0;

                for (Card card: cards)
                    if (card.getSuit() == suit)
                        suitCount++;

                if (suitCount >= 5) return true;
            }
        return false;
    }

    public static Boolean isStraight(ArrayList<Card> cards) {
        cards.sort(new CardComparator());

        for(Integer i = 0; i < cards.size(); i++)
        {
            Integer count = 0;
            Integer currentRankNumber = cards.get(i).getRankNumber();

            for (Integer j = i; j < cards.size(); j++) {
                if (cards.get(j).getRankNumber() == currentRankNumber + 1)
                {
                    count++;
                    currentRankNumber++;
                }
                if (count >= 4)
                    return true;
            }
        }
        return false;
    }

    public static Boolean isThreeOfAKind(ArrayList<Card> cards) {
        return isRepeatRank(cards,3);
    }

    public static Boolean isTwoPair(ArrayList<Card> cards) {
        // TODO: change this obviously wrong code

//        Integer excludeRank = null;
//
//        for(Integer i = 0; i < cards.size(); i++)
//        {
//            Integer count = 0;
//            Integer currentRankNumber = cards.get(i).getRankNumber();
//            for (Integer j = i; j < cards.size(); j++) {
//                if (cards.get(j).getRankNumber().equals(currentRankNumber))
//                    count++;
//
//                if (count >= 2)
//                    excludeRank = currentRankNumber;
//
//            }
//        }
        return false;
    }

    public static Boolean isPair(ArrayList<Card> cards) {
        return isRepeatRank(cards,2);
    }

    public static Boolean isRepeatRank(ArrayList<Card> cards, Integer numOfRepeat)
    {
        for(Integer i = 0; i < cards.size(); i++)
        {
            Integer count = 0;
            Integer currentRankNumber = cards.get(i).getRankNumber();
            for (Integer j = i; j < cards.size(); j++) {
                if (cards.get(j).getRankNumber().equals(currentRankNumber))
                    count++;

                if (count >= numOfRepeat)
                    return true;
            }
        }
        return false;
    }

}

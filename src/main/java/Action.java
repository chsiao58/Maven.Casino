import java.util.ArrayList;
import java.util.Arrays;

public class Action {
    private  String input;

    public Action(String input) {
        this.input = normalizeInput(input);
    }

    public String toActionString() {
        return "";
    }

    public Act getAct() {
        String[] quit = {"leave", "end", "quit", "q", "leave game", "end game"};
        String[] play = {"play game", "games", "game", "play a game", "play games", "gamble", "play"};
        String[] bj = {"blackjack", "bj", "2"};
        String[] poker = {"Texas Hold 'em", "poker", "3"};
        String[] palace = {"palace", "1"};
        String[] craps = {"craps", "dolio style craps", "dolio-style craps", "ds craps", "dolio", "4"};
        String[] ceelo = {"cee lo", "cee-lo", "ceelow", "cee-low", "ceelo", "5"};
        String[] drink = {"drink", "get a drink", "bar", "water"};
        String[] eat = {"eat", "get a bite to eat", "food", "restaurant", "grub", "chow", "dinner", "snacks"};
        String[] lounge = {"lounge", "lobby", "restroom", "rest room", "resting room"};
        if (isIn(quit)) return Act.QUIT;
        if (isIn(play)) return Act.PLAY;
        if (isIn(bj)) return Act.BLACKJACK;
        if (isIn(poker)) return Act.POKER;
        if (isIn(palace)) return Act.PALACE;
        if (isIn(craps)) return Act.CRAPS;
        if (isIn(ceelo)) return Act.CEELO;
        if (isIn(eat)) return Act.EAT;
        if (isIn(drink)) return Act.DRINK;
        if (isIn(lounge)) return Act.LOUNGE;
        return Act.UNKNOWN;
    }

    private Boolean isIn(String[] possibilities) {
        ArrayList<String> look = new ArrayList<>(Arrays.asList(possibilities));
        return look.contains(input);
    }
    private String normalizeInput(String input) {
        return input.trim().toLowerCase();
    }

    protected String getInput() {
        return input;
    }
}

public class Action {
    private  String input;

    public Action(String input) {
        this.input = input;
    }

    public String toActionString() {
        return "";
    }

    public Act getAct() {
        String[] quitPossibilities = {"leave", "end", "quit", "q", "leave game", "end game"};
        String[] playPossibilities = {"play game", "games", "game", "play a game", "play games", "gamble"};
        String[] bjPossibilities = {"blackjack", "bj", "2"};
        String[] pokerPossibilities = {"Texas Hold 'em", "poker", "3"};
        String[] palacePossibilities = {"palace", "1"};
        String[] crapsPossibilities = {"craps", "dolio style craps", "dolio-style craps", "ds craps", "dolio"};
        String[] ceeloPossibilities = {"cee lo", "cee-lo", "ceelow", "cee-low", "ceelo"};
        String[] drinkPossibilities = {"drink", "get a drink", "bar", "water"};
        String[] eatPossibilities = {"eat", "get a bite to eat", "food", "restaurant", "grub", "chow", "dinner", "snacks"};
        String[] loungPossibilities = {"lounge", "lobby", "restroom", "rest room", "resting room"};

        return Act.QUIT;
    }

    public String normalizeInput() {
        return "";
    }
}

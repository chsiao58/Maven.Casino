public abstract class Game {


    protected Player[] players;
    protected Player player;

    public Game(Player[] players) {

        this.players = players;

    }

    public Game(Player player) {
            this.player = player;
    }

        //  abstract Boolean didWin(Player player);
        abstract void playGame ();
        abstract void endOfGame ();

    }


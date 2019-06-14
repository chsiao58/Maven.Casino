public class DolioStyleCraps extends DiceGame {

    public DolioStyleCraps(DStyleCrapsPlayer[] players) {
        super(players, 2);
    }

    public Boolean didWin(Player player) {return false;}
    public void playGame() {}
    public Boolean endOfGame() {
        return null;
    }
}

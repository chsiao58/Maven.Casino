public class Chips {

    private Integer chips;

    public Chips(Integer chips) {
        this.chips = chips;
    }

    public Integer getChips() {
        return chips;
    }

    public Chips(Double moneyForChips) {
        this.chips = (int)Math.floor(moneyForChips/5.0);
    }
}

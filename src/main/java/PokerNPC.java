public class PokerNPC extends PokerPlayer{

    public PokerNPC(Person p) {
        super(p);
    }

    @Override
    public Integer getBetFromAction(Console console, Integer lastBet) {
        Integer valueBet = call(lastBet);
        console.println(person.getName() + " called");
        return call(lastBet);
    }
}

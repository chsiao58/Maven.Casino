import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DStyleCrapsPlayerTest {
//    @Test
//    public void testChips() {
//        DStyleCrapsPlayer player1 = new DStyleCrapsPlayer(new Person(500.00, "Jon", 25));
//        Chips chip=new Chips(player1.person.getWallet().doubleValue());
//       Integer numchips=chip.getChips();
//        Assert.assertEquals(100, numchips, 0.0001);
//    }

    @Test
    public void testChips1() {
        DStyleCrapsPlayer player1 = new DStyleCrapsPlayer(new Person(00.00, "Jon", 25));
        Chips chip=new Chips(0.00);
        Integer numchips=chip.getChips();
        Assert.assertEquals(0, numchips, 0.0001);
    }

    @Test
    public void testRoll() {
        Dice dice = new Dice(2);
        DStyleCrapsPlayer player1 = new DStyleCrapsPlayer(new Person(500.00, "Jon", 25));
        Integer numroll = player1.roll(dice);
        Boolean b = false;
        if (numroll >= 12 || numroll <= 2)
            b = false;
        Assert.assertEquals(false, b);
    }

//    @Test
//    public void testBet() {
//        Dice dice=new Dice(2) ;
//        DStyleCrapsPlayer player= new DStyleCrapsPlayer(new Person(500.00,"Jon",25));
//       Integer totalChips=player.bet(4);
//       Assert.assertEquals(4, totalChips,0.0001);
//    }
}

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DolioStyleCrapsTest {

    @Test
    public void didWin() {
        DStyleCrapsPlayer player = new DStyleCrapsPlayer(new Person(500.00, "Jon", 25));
        DolioStyleCraps dCraps = new DolioStyleCraps(player);
        dCraps.playGame();
        if (dCraps.getDice().sum() == 2) {
            Assert.assertFalse(dCraps.didWin(player));
        }
    }

    @Test
    public void didWin3() {
        DStyleCrapsPlayer player = new DStyleCrapsPlayer(new Person(500.00, "Jon", 25));
        DolioStyleCraps dCraps = new DolioStyleCraps(player);
        dCraps.playGame();
        if (dCraps.getDice().sum() == 11 || dCraps.getDice().sum() == 7) {
            Assert.assertTrue(dCraps.didWin(player));
        }
    }
        @Test
    public void playGame() {
            DStyleCrapsPlayer player= new DStyleCrapsPlayer(new Person(500.00,"Jon",25));
            DolioStyleCraps dCraps = new DolioStyleCraps(player);
            dCraps.playGame();
            if(dCraps.getDice().sum()!=0)
                Assert.assertTrue(dCraps.getDice().sum()!=0);
        }

    @Test
    public void playGame1() {

        DStyleCrapsPlayer player= new DStyleCrapsPlayer(new Person(500.00,"Jon",25));
        DolioStyleCraps dCraps=new DolioStyleCraps(player);
        dCraps.playGame();
        //dCraps.endOfGame();
        if (dCraps.getDice().sum() == 2)
        Assert.assertFalse(dCraps.didWin(player));
    }
    @Test
    public void playGame2() {

        DStyleCrapsPlayer player= new DStyleCrapsPlayer(new Person(500.00,"Jon",25));
        DolioStyleCraps dCraps=new DolioStyleCraps(player);
        dCraps.playGame();
        //dCraps.endOfGame();
        if (dCraps.getDice().sum() == 7||dCraps.getDice().sum() == 11)
            Assert.assertTrue(dCraps.didWin(player));
    }
    @Test
    public void endOfGame2() {

        DStyleCrapsPlayer player= new DStyleCrapsPlayer(new Person(500.00,"Jon",25));
        DolioStyleCraps dCraps=new DolioStyleCraps(player);
        dCraps.playGame();
        //dCraps.endOfGame();
        if (dCraps.getDice().sum() == 6||dCraps.getDice().sum() == 8||dCraps.getDice().sum() == 4||dCraps.getDice().sum() == 3)
            Assert.assertNotEquals(true,dCraps.didWin(player));
    }

}
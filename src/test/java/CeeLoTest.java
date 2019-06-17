import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CeeLoTest {

    // start game
    // take bet
    // end game
    // declare winner/ payout

    @Test
    public void startGame(){

        CeeLo ceeLoGame  = new CeeLo();
        Person p = new Person();
        CeeLoPlayer player = new CeeLoPlayer(p);
        Dice cDice = new Dice(3);
        Double bet =  50.0;
        ceeLoGame.startGame();
        Double pool = ceeLoGame.getPool();

        Assert.assertEquals(bet, pool);

    }
}

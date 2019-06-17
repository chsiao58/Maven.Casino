import org.junit.Test;

import static org.junit.Assert.*;

public class CeeLoPlayerTest {

    @Test
    public void playerTakeTurn(){
        CeeLoPlayer player  = new CeeLoPlayer(new Person( 50.0," Will" , 27));
        CeeLo ceeloGame = new CeeLo(player);
        ceeloGame.getDice().toss();


    }
}
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PokerTest {

    Poker game;
    PokerPlayer player;
    @Before
    public void setUp() throws Exception {
        player = new PokerPlayer(new Person(300.0,"John", 21));
        game = new Poker(player, new Console(System.in, System.out));
    }

    @Test
    public void constructorTest() {
        Assert.assertEquals(52, game.decks.getCards().size());
    }

    @Test
    public void flopTest() {
        game.flop();
        Assert.assertEquals(2, game.getCommunityCard().size());

    }

    @Test
    public void dealCardTest() {
        game.dealCardToAllPlayer();
        for (PokerPlayer p: game.getPokerPlayerList())
            Assert.assertEquals(2, p.getHand().getCards().size());
    }

    @Test
    public void showDownTimeTest() {
        game.flop();
        Assert.assertFalse(game.showDownTime());
    }
}
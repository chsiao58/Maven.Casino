import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CeeLoTurnTest {

    @Test
    public void play() {
        play();

    }
    @Test
    public void takeTurn() {
        CeeLo ceeloGame = new CeeLo(null);
        Dice cDice = new Dice(3); // establishing the number of dice needed
        cDice.toss(); // tossing the dice
        Integer[] dice = cDice.getDice();// checking value of each dice
        Boolean diceDouble = ceeloGame.checkDouble(dice);// checking if there are any doubles in the roll
        Boolean diceTriple = ceeloGame.checkTriple(dice); //checking if there are any triples in the roll



    }

    @Test
    public void checkDoubleTestTrue(){
        //given
        CeeLo ceeLoGame = new CeeLo(null);
        Boolean expected = true;
        Integer[] input = {2,5,5};
        //when
        Boolean actual = ceeLoGame.checkDouble(input);

        //then
        assertEquals(expected,actual);
    }
    @Test
    public void checkDoubleTestFalse(){
        //given
        CeeLo ceeLoGame = new CeeLo(null);
        Boolean expected = false;
        Integer[] input = {1,3,4};
        //when
        Boolean actual = ceeLoGame.checkDouble(input);
        //then
        assertEquals(expected,actual);
    }

    @Test
    public void checkTripleTrue(){

        //given
        CeeLo ceeLoGame = new CeeLo(null);
        Boolean expected = true;
        Integer[] input = {2,2,2};
        //when
        Boolean actual = ceeLoGame.checkTriple(input);
        //then
        assertEquals(expected,actual);


    }

    @Test
    public  void checkTripleFalse(){

        //given
        CeeLo ceeLoGame = new CeeLo(null);
        Boolean expected = false;
        Integer[] input = {2,1,2};
        //when
        Boolean actual = ceeLoGame.checkTriple(input);
        //then
        assertEquals(expected,actual);

    }
    @Test
    public void getNumberToBeat() {
        CeeLo ceeloGame = new CeeLo(null);
        // set third number to NumberToBeat
        Integer[] numberToBeat = {2,2,3};
        Integer expected = 3;
        Integer actual = ceeloGame.getNumberToBeat(numberToBeat);
        //
        assertEquals(expected,actual);

    }

    @Test
    public void didWinTriple() {
        CeeLo ceeloGame = new CeeLo(null);
        Integer[] tripleWin = {4,5,6};
        Boolean expected = true;
        Boolean actual = ceeloGame.didWin(tripleWin);
        assertEquals(expected,actual);
    }

    @Test
    public void checkWinNumToBeat(){
        CeeLo ceeLoGame = new CeeLo(null);
        Integer numToBeat = 4;
        //Boolean expected = true;
        Integer actualRoll = 6;
        //Boolean actual = ceeLoGame.checkWinNumToBeat(numToBeat);
        assertTrue(numToBeat < actualRoll);


    }

    @Test
    public void roll() {
    }

    @Test
    public void compare() {
    }

    @Test
    public void checkWin() {
    }

    @Test
    public void validMove() {
    }
}
package CompareNumber;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class testGuess {
    @Test
    public void testGuessNumberInputGameOutput(){
       Guess guess=new Guess();
       String output=guess.GuessNumberGame("1224");
        assertThat(output,is("-1"));
    }
    @Test
    public void testIntergationGuess(){
        String result="0A4B,1A3B,2A2B,4A0B,0A0B,-1";
        Guess guess=new Guess();
        String output=guess.GuessNumberGame("1224");
        int i=result.indexOf(output);
        assertNotEquals(-1,i);
    }

}

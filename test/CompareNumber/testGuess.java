package CompareNumber;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class testGuess {
    /*单元测试*/
    @Test
    public void testGuessNumberInputDuplicate(){
       Guess guess=new Guess();
       String output=guess.GuessNumberGame("1224");
        assertThat(output,is("-1"));
    }
    @Test
    public void testGuessNumberOutputTrue(){
        String result="0A4B,1A3B,2A2B,4A0B,0A0B,-1";
        Guess guess=new Guess();
        String output=guess.GuessNumberGame("1234");
        int i=result.indexOf(output);
        assertNotEquals(-1,i);
    }
    /*集成测试*/
    @Test
    public void testIntergationGuessInputDuplicate(){
        String output=new String();
        AnswerGenerator answergerenator=new AnswerGenerator();
        String answer=answergerenator.GeneratorWithoutRepetition();
        CompareNumber comparenumber=new CompareNumber();
        output=comparenumber.CompareAnswerAndInput("1224",answer);
        assertThat(output,is("-1"));
    }
    @Test
    public void testIntergationGuessOutputTrue(){
        String output=new String();
        AnswerGenerator answergerenator=new AnswerGenerator();
        String answer=answergerenator.GeneratorWithoutRepetition();
        CompareNumber comparenumber=new CompareNumber();
        output=comparenumber.CompareAnswerAndInput("1234",answer);
        String result="0A4B,1A3B,2A2B,4A0B,0A0B,-1";
        int i=result.indexOf(output);
        assertNotEquals(-1,i);
    }

}

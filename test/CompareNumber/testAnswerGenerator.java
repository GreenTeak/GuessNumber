package CompareNumber;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class testAnswerGenerator {
    /*数字为4位测试*/
    @Test
    public void checkAnswerNumber(){
        int shouldLen=4;
        AnswerGenerator answergenerator=new AnswerGenerator();
        String answernumber=answergenerator.GeneratorWithoutRepetition();
        int len=answernumber.length();
        assertEquals(len,shouldLen);
    }
    /* 不重复性测试*/
    @Test
    public void CheckFirstNotRepetition(){
        int CheckFirst=0;
        AnswerGenerator answergenerator=new AnswerGenerator();
        String answernumber=answergenerator.GeneratorWithoutRepetition();
        char first=answernumber.charAt(CheckFirst);
        for(int i=0;i<answernumber.length();i++){
            if(i!=CheckFirst){
                assertNotEquals(answernumber.charAt(i),first);
            }
            else i++;
        }
    }
    @Test
    public void CheckSecondNotRepetitiont(){
        int CheckSecond=1;
        AnswerGenerator answergenerator=new AnswerGenerator();
        String answernumber=answergenerator.GeneratorWithoutRepetition();
        char second=answernumber.charAt(CheckSecond);
        for(int i=0;i<answernumber.length();i++){
            if(i!=CheckSecond){
                assertNotEquals(answernumber.charAt(i),second);
            }
            else i++;
        }
    }
    @Test
    public void CheckThirdNotRepetition(){
        int CheckThird=2;
        AnswerGenerator answergenerator=new AnswerGenerator();
        String answernumber=answergenerator.GeneratorWithoutRepetition();
        char third=answernumber.charAt(CheckThird);
        for(int i=0;i<answernumber.length();i++){
            if(i!=CheckThird){
                System.out.println(answernumber.charAt(i));
                System.out.println(third);
                assertNotEquals(answernumber.charAt(i),third);
            }
            else i++;
        }
    }
    @Test
    public void ChecklastNotRepetion(){
        int CheckLast=3;
        AnswerGenerator answergenerator=new AnswerGenerator();
        String answernumber=answergenerator.GeneratorWithoutRepetition();
        char last=answernumber.charAt(CheckLast);
        for(int i=0;i<answernumber.length();i++){
            if(i!=CheckLast){
                assertNotEquals(answernumber.charAt(i),last);
            }
            else i++;
        }
    }
    /*随机性测试*/
    @Test
    public void checkAnswerRandom(){
        AnswerGenerator answergenerator=new AnswerGenerator();
        String answernumber1=answergenerator.GeneratorWithoutRepetition();
        String answernumber2=answergenerator.GeneratorWithoutRepetition();
        assertNotEquals(answernumber1,answernumber2);
    }
}

package CompareNumber;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class testCompareNumber {
    @Test
    public void  shouldReturn0A4B(){
        CompareNumber comparenumber=new CompareNumber();
        String result=comparenumber.CompareAnswerAndInput("1234","4321");
        assertThat(result,is("0A4B"));
    }
    @Test
    public void shouldReturn1A3B(){
        CompareNumber comparenumber=new CompareNumber();
        String result=comparenumber.CompareAnswerAndInput("1234","1423");
        assertThat(result,is("1A3B"));
    }
    @Test
    public void shouldReturn2A2B(){
        CompareNumber comparenumber=new CompareNumber();
        String result=comparenumber.CompareAnswerAndInput("1234","1243");
        assertThat(result,is("2A2B"));
    }
    @Test
    public void shouldReturn4A0B(){
        CompareNumber comparenumber=new CompareNumber();
        String result=comparenumber.CompareAnswerAndInput("1234","1234");
        assertThat(result,is("4A0B"));
    }
}

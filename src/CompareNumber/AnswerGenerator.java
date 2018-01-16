package CompareNumber;

import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.Random;

public class AnswerGenerator {
    final int Answerlen=4;
    public String GeneratorWithoutRepetition(){
        String answer=new String();
        Random ran=new Random();
        HashSet<Integer> answernumber=new HashSet<>(Answerlen);
        while (answernumber.size()<Answerlen){
            answernumber.add(ran.nextInt(10));
        }
        answer= answernumber.toString();
        return  answer;
    }
}

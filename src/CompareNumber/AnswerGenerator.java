package CompareNumber;

import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class AnswerGenerator {
    final int Answerlen=4;
    public String GeneratorWithoutRepetition(){
        String answer=new String();
        Random ran=new Random();
        HashSet<Integer> answernumber=new HashSet<>();
        while (answernumber.size()<Answerlen){
            answernumber.add(ran.nextInt(10));
        }
        Iterator it = answernumber.iterator();
        for(int i=0;i<Answerlen;i++){
            answer+=it.next().toString();
        }
       // answer= answernumber.toString();
        System.out.println(answer);
        return  answer;
    }
}

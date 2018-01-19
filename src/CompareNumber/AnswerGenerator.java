package CompareNumber;

import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
/*
写一个AnswerGenerator类，只有一个函数，
返回一个四位，每位都不重复随机数。 请对这个 类写测试。（思考测试哪些）
 */
public class AnswerGenerator {
    final int Answerlen=4;
    public String GeneratorWithoutRepetition(){
        String answer=new String();
        String savenum=new String();
        int[] savelocation=new int[Answerlen];
        Random ran=new Random();
        HashSet<Integer> answernumber=new HashSet<>();
        while (answernumber.size()<Answerlen){
            answernumber.add(ran.nextInt(10));
        }
        Iterator it = answernumber.iterator();
        for(int i=0;i<Answerlen;i++){
            savenum+=it.next().toString();
        }
        while (answer.length()<Answerlen){
            int i=ran.nextInt(Answerlen);
            if(savelocation[i]!=1){
                answer+=savenum.charAt(i);
                savelocation[i]=1;
            }
        }
        return  answer;
    }
}

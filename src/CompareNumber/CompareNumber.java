package CompareNumber;

/*  写一个CompareNumber类，只有一个函数，该函数接受两个参数，一个是答案，
 一个是用户输 入的四位数。返回值是xAxB的字符串 这里我们假定答案和用户输入
 都是合法的四位数。不用考虑数字合法性问题。 请对这个类写测试（思考要写几个测试）
*/
public class CompareNumber {
   public String CompareAnswerAndInput(String InputNumber,String AnswerNumber){
       /* 检查输入合法性，即输入中是否含有重复字符 */
       char[] elements=InputNumber.toCharArray();
       for(char e:elements){
           if(InputNumber.indexOf(e)!=InputNumber.lastIndexOf(e)){
               return "-1";
           }
       }
       /* 检查输入的字符是否全猜对*/
       for(int i=0;i<AnswerNumber.length();i++){
           char num=AnswerNumber.charAt(i);
           if(InputNumber.indexOf(num)==-1){
               return "0A0B";
           }
       }
       /*猜对位置数字也对为A,猜对位置数字不对为B*/
       String output=new String("");
       int NumA=0;
       int NumB=0;
       for(int i=0;i<InputNumber.length();i++){
           if(InputNumber.charAt(i)==AnswerNumber.charAt(i)){
               NumA++;
           }
           else NumB++;
       }
       output+=(String.valueOf(NumA)+"A"+String.valueOf(NumB)+"B");
       return output;
   }
}

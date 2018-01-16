package CompareNumber;

public class CompareNumber {
   public String CompareAnswerAndInput(String InputNumber,String AnswerNumber){
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

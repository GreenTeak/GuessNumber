package CompareNumber;

public class Guess {
    final int Answerlen=4;
    public  String GuessNumberGame(String Input) {
        String output=new String();
        AnswerGenerator answergerenator=new AnswerGenerator();
        String answer=answergerenator.GeneratorWithoutRepetition();
        for(int i=0;i<Answerlen;i++){
            int s=Input.indexOf(answer.charAt(i));
            if(s==-1) return "-1";
        }
        CompareNumber comparenumber=new CompareNumber();
        output=comparenumber.CompareAnswerAndInput(Input,answer);
        return output;
    }
}

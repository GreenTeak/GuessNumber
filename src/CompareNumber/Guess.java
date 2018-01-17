package CompareNumber;

public class Guess {
    final int Answerlen=4;
    public  String GuessNumberGame(String Input) {

        char[] elements=Input.toCharArray();
        for(char e:elements){
            if(Input.indexOf(e)!=Input.lastIndexOf(e)){
                return "-1";
            }
        }
        String output=new String();
        AnswerGenerator answergerenator=new AnswerGenerator();
        String answer=answergerenator.GeneratorWithoutRepetition();
        CompareNumber comparenumber=new CompareNumber();
        output=comparenumber.CompareAnswerAndInput(Input,answer);
        return output;
    }
}

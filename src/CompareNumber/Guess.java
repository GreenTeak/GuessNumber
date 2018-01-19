package CompareNumber;

public class Guess {
    final int Answerlen=4;
    public  String GuessNumberGame(String Input) {
        String output=new String();
        AnswerGenerator answergerenator=new AnswerGenerator();
        String answer=answergerenator.GeneratorWithoutRepetition();
        CompareNumber comparenumber=new CompareNumber();
        output=comparenumber.CompareAnswerAndInput(Input,answer);
        return output;
    }
}

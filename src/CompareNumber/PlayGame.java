package CompareNumber;

import java.util.Scanner;

public class PlayGame {
        public static void main(String args[]) {
            System.out.println("Welcome!");
            System.out.println();
            int playtime=6;
            while (playtime!=0){
                Scanner sc = new Scanner(System.in);
                System.out.println("Please input your number"+"("+playtime+")");
                String input = sc.nextLine();
                Guess guess=new Guess();
                String output=guess.GuessNumberGame(input);
                if(output=="-1") {
                    System.out.println("Cannot input duplicate numbers!");
                    playtime--;
                    continue;
                }
                if(output==input) {
                    System.out.println("Congratulations!");
                    break;
                }
                else System.out.println(output);
                playtime--;
            }
            if(playtime==0)  System.out.println("Game Over!");
        }
}

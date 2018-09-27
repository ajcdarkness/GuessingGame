package JCedar;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        betterGuesses();
    }

    public static void guessingGame() {
        int rNum = (int) (10 * Math.random());
        Scanner input = new Scanner(System.in);
        System.out.println("What's your guess between 0 and 9");
        int x = 15;
        while (x != rNum) {
            x = input.nextInt();
            if (x == rNum) {
                System.out.println("Correct");
            } else {
                System.out.println("Not Quite");
            }
        }
    }

    public static void betterGuesses() { //Computer guesses and we answer "higher", "lower", or "correct"
        Scanner input = new Scanner(System.in);
        int initial = 50;
        System.out.println("50");
        int winCondition = 0;
        int guessCount = 1;
        while (winCondition == 0) {
            String UI = input.nextLine();
           int num = 100/(guessCount*2 + 2); //Amount +- the curent guess is decided here
           if(UI.equals("higher")){
               if(initial < 90) { //if num is greater then 90 it was throwing an error so modified the code.
                   initial = initial + num; //adds to the number about to be guessed based upon the amount of guesses made and the previous guess
                   System.out.println(initial);
               }else{ // greater then 90 iterate by 1
                   initial = initial + 1;
                   System.out.println(initial);
               }
           }else if(UI.equals("lower")){
               if(initial >10) { ////if num less then 10 it was throwing an error so modified the code.
                   initial = initial - num; //subtracts to the number about to be guessed based upon the amount of guesses made and the previous guess.
                   System.out.println(initial);
               }else{ // less then 10 iterate by 1
                   initial = initial - 1;
                   System.out.println(initial);
               }
           }else if(UI.equals("correct")){ //if the guess is correct, break the while loop and computer states that it won
               System.out.println("I have guessed correctly");
               winCondition = 1;
           }
           guessCount++;
        }
        System.out.println("done");
    }
}
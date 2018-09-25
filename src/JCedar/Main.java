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

    public static void betterGuesses() {
        Scanner input = new Scanner(System.in);
        int winCondition = 0;
        int guessCount = 0;
        int y = 100;
        while (winCondition == 0) {
            System.out.println(y / 2);
            guessCount++;
            if (input.nextLine() == "higher") {
                y = y / 2 + y / 4;
                guessCount++;
                System.out.println(y);
                if(input.nextLine() == "higher"){
                    y = y + y/8;
                    guessCount++;
                }else if(input.nextLine() == "lower"){
                    y = y/2 + y/4;
                }
            } else if (input.nextLine() == "lower") {
                y = y - y/4;
                System.out.println(y);
                guessCount++;
                if(input.nextLine() == "higher"){
                    y = y + y/8;
                    guessCount++;
                }
            }else if(input.nextLine() == "correct")
                winCondition = 1;

        }
        System.out.println("done");
    }
}
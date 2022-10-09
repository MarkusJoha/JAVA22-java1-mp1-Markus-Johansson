import java.util.Scanner;
import java.util.Random;

public class miniProject {

    public static void main(String[] args) {

        Random randNum = new Random();
        int answer = randNum.nextInt(100);
        System.out.println("Welcome to the Guessing game!");
        System.out.println("The goal of this game is to guess on an number of 0-100.");
        System.out.println("If you get it right, the program will congratulate you and write out how many tries it took you.");
        System.out.println("With that being said, what's your first guess?");
        int guess = 0;
        checkAnswer(guess, answer);
    }

    static void checkAnswer(int guess, int answer) {
        
        int attempt = 1;

        while (guess != answer) {

            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if (guess > answer) {
                System.out.println("Your guess is too high!");
                attempt++;
            } else if (guess < answer) {
                System.out.println("Your guess is too low!");
                attempt++;
            } else {
                System.out.println("Congratulations, you've won the game, the answer is: " + answer + ". You got it right after " + attempt + " guesses.");
            }

        }
    }
}

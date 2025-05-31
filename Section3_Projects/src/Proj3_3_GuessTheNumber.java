import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
        int opp = 0;
        int number = rand.nextInt(100) + 1;
        boolean flag = false;

        while(!flag){
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            opp++;
            if(guess >= 1 && guess <= 100) {
                if (guess == number) {
                    System.out.println("You are correct!! " );
                    flag = true;
                } else if (guess > number) {
                    System.out.println("You guess was too high");
                } else {
                    System.out.println("You guess was too low");
                }
            }
            else{
                System.out.println("That was a wasted guess, pick a number between 1 and 100");
            }
        }
    }
}

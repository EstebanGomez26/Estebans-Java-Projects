import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the pub");

        System.out.println("Please enter your age");
        age = sc.nextInt();

        if(age>= 21) {
            System.out.println("Have a beer!");
        }

        else if (age >= 16) {
            System.out.println("Have a Coke!");
            System.out.println("At least you can drive");
        }
        else {
            System.out.println("Have a Coke!");
        }
        System.out.println("Thanks for coming to the pub");
    }
}

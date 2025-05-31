import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;

        System.out.println("Please enter a non-negative integer for the sum ");
        System.out.println("Or negative to exit");
        input = scanner.nextInt();

        while (input >= 0) {
            sum += input;
            System.out.println(sum);
            System.out.println("Please enter a non-negative integer ");
            System.out.println("Or negative to exit");
            input = scanner.nextInt();
        }
        System.out.println("Your sum is: " + sum);

    }
}

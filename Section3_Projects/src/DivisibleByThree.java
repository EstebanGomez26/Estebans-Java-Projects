import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter number");
        num = sc.nextInt();

        if(num%3==0){
            System.out.println("THe number is divisible by three");
        }
        else{
            System.out.println("The number is not divisible by three");
        }
    }
}

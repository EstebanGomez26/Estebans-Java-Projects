import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args){
        /* My solution to the project
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        double avg;

        System.out.println("Please enter the first number:");
        num1 = input.nextInt();
        input.nextLine();
        System.out.println("Please enter the second number:");
        num2 = input.nextInt();
        input.nextLine();
        System.out.println("Please enter the third number:");
        num3 = input.nextInt();
        input.nextLine();

        avg = (num1 + num2 + num3) /3d;

        System.out.println("The average of the numbers is: " + avg);
        */

        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double avg;

        System.out.println("Please enter 3 numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        input.nextLine(); //good habit

        avg = (num1+num2+num3)/3;
        System.out.println("The average is "+avg);


    }//end main
}

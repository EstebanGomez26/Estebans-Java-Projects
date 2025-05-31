import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double number;


        System.out.println("Enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // consume a new line

        System.out.println("Enter a real number: ");
        number = keyboard.nextDouble() * 2;
        keyboard.nextLine();

        System.out.println("Enter your city: ");
        city = keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your city is " + city);
        System.out.println("Your number is " + number);


    }//end main
}

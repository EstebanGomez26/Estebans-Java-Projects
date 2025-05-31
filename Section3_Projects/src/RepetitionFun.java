import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Please enter a non-negative integer ");
        System.out.println("Or negative to exit");
        input = sc.nextInt();

        while (input >= 0) {
            System.out.println(input);
            System.out.println("Please enter a non-negative integer ");
            System.out.println("Or negative to exit");
            input = sc.nextInt();
        }



        /*
        int count = 0;

        System.out.println("While");
        while(count < 1){
            System.out.println(count);
            count++;
        }

        count = 8;
        System.out.println("Do-While");

        do{
            System.out.println(count);
            count++;
        }while(count < 10);


        System.out.println("For");
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }

         */
    }
}

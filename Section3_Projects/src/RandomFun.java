import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("Your random: "+ myRandomNumber);

        myRandomNumber = random.nextInt(1000); //0 - 999
        System.out.println("0 to 999: " + myRandomNumber);

        myRandomNumber = random.nextInt(1000) + 1; //1 - 1000
        System.out.println("1 to 1000: " + myRandomNumber);
    }
}

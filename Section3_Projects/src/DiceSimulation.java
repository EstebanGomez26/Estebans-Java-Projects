import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice;

        for (int i = 0; i < 10; i++) {
            dice = rand.nextInt(6) + 1;
            System.out.println(dice);
        }

    }
}

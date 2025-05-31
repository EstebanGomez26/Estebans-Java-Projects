public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 20;

        System.out.println("Age: " + age);
        System.out.println();//add space

        if (age >= 16) {
            System.out.println("You can drive");
        } else {
            System.out.println("You cannot drive");
        }
        System.out.println();//add space


        for (int i = 1; i <= age; i++) {
            System.out.println("Happy birthday " + i);
        }
    }
}

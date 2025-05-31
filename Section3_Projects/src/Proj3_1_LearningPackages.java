import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lp;
        int c;
        int cost=0;

        System.out.println("Choose your package, input 1, 2 or 3:");
        lp = sc.nextInt();
        System.out.println("Total of courses for the month:");
        c = sc.nextInt();

        switch (lp) {
            case 1:
                cost +=10;
                if(c>2){
                    cost += 6*(c-2);
                }
                break;
            case 2:
                cost +=12;
                if(c>4){
                    cost += 4*(c-4);
                }
                break;
            case 3:
                cost +=15;
                if(c>6){
                    cost += 3*(c-6);
                }
                break;
        }

        System.out.println("Total cost of courses for the month: $" + cost);

    }
}

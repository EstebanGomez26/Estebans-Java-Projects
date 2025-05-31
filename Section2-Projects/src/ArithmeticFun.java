public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //Binary operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("The sum result is: " + result);
        System.out.println("The diff result is: " + difference);
        System.out.println("The product result is: " + product);
        System.out.println("The div result is: " + quotient);
        System.out.println("The rem result is: " + remainder);

        result += difference; //result = result + difference;
        System.out.println("The additional result is: " + result);

        //Unary operator
        result++; //++result
        System.out.println("Result ++ is: " + result);

        result--; //--result;
        System.out.println("Result -- is: " + result);


        product *= 2;
        System.out.println("The product is: " + product);


    }//end main
}

public class RelationalFun {
    public static void main(String[] args) {
        boolean mine = true;
        boolean yours = false;
        int myAge = 27;
        int yourAge = 20;
        int rominasAge = 27;

        String myName = "Esteban";
        String yourName = "Estebana";

        int currentAge = 27;

        System.out.println("my bool is" + mine);
        System.out.println("yours bool is" + yours);


        //relational operators
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > rominasAge;
        System.out.println("yourAge > rominasAge?: " + ageComparison);

        ageComparison = myAge == rominasAge;
        System.out.println("myAge == rominasAge?: " + ageComparison);


        boolean nameComparison = myName.equals(yourName);
        System.out.println("myName == yourName?: " + nameComparison);

        boolean ageComparison2 = currentAge >= 21;
        System.out.println("currentAge >= 21?: " + ageComparison2);

    }//end main
}

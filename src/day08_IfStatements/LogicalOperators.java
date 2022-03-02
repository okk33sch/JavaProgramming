package day08_IfStatements;

import javax.xml.namespace.QName;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Daniel";
        int age = 34;
        String citizen = "North Korea";

        boolean isEligile = age >= 18 && citizen == "USA";
                            // 19 >= 18 && "UK" == "USA"
                            // true     && false ==>

        System.out.println(name + " is eligible to vote: " + isEligile);

        System.out.println("-------------------------------------------------------");

        String name2 = "Josh";

        int creditScore = 800;
        int age2 = 42;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("-------------------------------------------------------");

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender =='F');
                //               21>= 18 && ( 'F' == 'M' || 'F; =='F )
                //               true    && ( false      ||  true )
                //               true    &&   true
                //               true

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("-------------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";

        boolean marriedToUsCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUsCitizen == true;
        //                      true                  || false

        System.out.println(name4 + " is eligible to apply for US citizenShip: " + isEligible4);

        System.out.println("-------------------------------------------------------");

        String student = "Ali";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
                            //     false || true

        System.out.println(student + " is eligible for scolarship: " + isEligible5);

        System.out.println("-------------------------------------------------------");
        
        boolean result2 = true;

        System.out.println("result2 = " + result2);
        
        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean fail = !passed;

        System.out.println("passed = " + passed);
        System.out.println("fail = " + fail);











        /*

        &&: both
        ||: either

         */

    }
}

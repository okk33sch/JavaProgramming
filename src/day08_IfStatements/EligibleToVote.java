package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; // True
        // Eligible
        if (isEligible){ // True
            System.out.println("Eligible");

        }

        // Not eligible
        if (!isEligible){ // !True
            System.out.println("Not eligible");

        }

    }
}

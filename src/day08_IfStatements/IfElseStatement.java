package day08_IfStatements;

public class IfElseStatement {

    public static void main(String[] args) {

        int score = 40;

        if (score >= 0 && score <= 100){ // pre-condition: if the score is valid

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid Score");
        }


    }
}

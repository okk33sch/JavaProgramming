package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if(i == 'C'){
                continue;
                //break;
            }
            System.out.print(i+" ");

            System.out.println("-----------------------------------");
            // Print all even numbers between 1~10 (skip the odd numbers)

            for (int j = 1; j < 11; j++) {

                if(j%2 == 1){
                    continue;
                }
                System.out.println(j + " ");

            }



            System.out.println("-----------------------------------");
            // Print all odd numbers between 1~10 (skip the even numbers)

            for (int k = 1; k < 11; k++) {

                if(k%2 == 0){
                    continue;
                }
                System.out.println(k + " ");

            }


        }
    }
}

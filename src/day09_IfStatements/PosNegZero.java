package day09_IfStatements;


public class PosNegZero {

    public static void main(String[] args) {

        int a = 4;

        if(a > 0){
            System.out.println(a + " is a positive number.");
        }else if(a < 0){
            System.out.println(a + " is a negative number.");
        }else{
            System.out.println(a + " is number zero.");
        }
    }
}


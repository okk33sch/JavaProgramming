package GroupMeetingPractices;

import java.util.Scanner;

public class UnitTesting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        hello(scanner.nextLine());



    }

    private static void hello(String str){
        System.out.println("str = " + str);
    }

    private static String whatever(){
        System.out.println("This is my call time");
        return "What is good?";
    }



}


























    /*
    public static void main(String[] args) {
        sum(12);
        sum(12.4); // will give me the sum of these 0-11
        sum(4, 17); // will give me the sum of these 4-17
        // sum(3, 0.5, 10, 7); // returns me the sum of these three numbers
    }

    private static String sum(int i, int i1){ // the name has to be the same, parameters have to be different
        return "hello";                                                                //  parameters can different in tow away
                                                                        //  change the number of parameters

    }
    public int sum(int i){
        return i;
    }
    public static int sum(double i){
        return 2;
    }

}

// if the methods has the same name but different parameters that that means that method is overloaded
// What can we change to the method signiture if we overload a mothod

     */

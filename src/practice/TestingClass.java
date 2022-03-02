package practice;

import java.util.Scanner;

public class TestingClass {
    // nested Loops
    // String class
    public static void main(String[] args) {
        int i = 0; // initial state
        int j = 0;
            // 0, 2, 4, 6, 8, 10
            // 1 2 3 4 5 6 7 8 9 10
        while (i<=5){ // condition


            while (j<=5){
                j++;
            }
            i++;
            //System.out.println("" + i + "\n");
            //i = i+2; // exit factor or incremental/decremental
        }
        System.out.println("i = "+i); // 5
        System.out.println("j = "+j); // 25
    }
}

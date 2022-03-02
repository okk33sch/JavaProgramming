package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

                        // a= 15, b= 10, c= 20  a= 15, c= 10, b= 20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
                        // b= 15, a= 20, c= 10  b= 15, a= 10, c= 20
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
                        // a= 15, b= 10, c= 20  a= 15, c= 10, b= 20
        //boolean cIsMedian = (c > a && c < b) || (c > b && c < a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        /*
        in order for a to be the median number:
                1. if c is the maximum number & b is the minimum number, then a is the median number
                2. if b is the maximum number & c is the minimum number, then a is the median number
         */

        if(aIsMedian){ // if a is the median number
            System.out.println(a + " is median number.");
        }
        if(bIsMedian){ // if b is the median number
            System.out.println(b + " is median number.");
        }
        if(cIsMedian){ // if c is the median number
            System.out.println(c + " is median number.");
        }

    }
}


/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number


            Possibility #1: a could be median number
            Possibility #2: b could be median number
            Possibility #3: c could be median number

 */
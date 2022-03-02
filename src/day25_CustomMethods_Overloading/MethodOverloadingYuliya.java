package day25_CustomMethods_Overloading;

public class MethodOverloadingYuliya {
    public static void main(String[] args) {

        int r1 =   sum(10, 20);
        int r2 = sum(10,20,30);
        int r3 = sum(10, 20, 30, 40);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        double r4 = sum(10.5, 20.5);
        double r5 = sum(10.5,20.5,30.5);
        double r6 = sum(10.5, 20.5, 30.5, 40.5);

        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);
    }


    public static int sum(int a, int b){
        return a +b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c){
        return sum(a, b) + c;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return sum(a, b, c) + d;
    }

    public static double sum(double a, double b, double c, double d){
        return sum(a, b, c ) + d;
    }


}
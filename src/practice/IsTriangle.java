package practice;

public class IsTriangle {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);

        System.out.println("\na :" + a + " b :" + b + " c :" + c);

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("This is triangle");
        } else {
            System.err.println("The numbers are not make triangle");

        }

        System.out.println("_____________________________________");

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int z = (int) (Math.random() * 10);
        System.out.println("\nx :" + x + " y :" + y + " z :" + z);

        if (Math.abs(x - z) < y && Math.abs(y - z) < x && Math.abs(x - y) < z) {
            System.out.println("This is triangle");
        } else {
            System.err.println("The numbers are not make triangle");

        }


    }

}

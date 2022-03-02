package practice;

public class MultiplicationChart {
    public static void main(String[] args) {
        for (int m=1;m<=10;m++){
            for (int n=1;n<=10;n++){
                int num=m*n;
                System.out.print(num+"     ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        int x,y;
        int i = 0;
        for( x=1; x<=10; x++){
            System.out.println("   ");
            for(y=1; y<=10; y++)
            {
                System.out.print(x+" x "+y+" = "+x * y + "\t\t");

            }

        }

    }
}
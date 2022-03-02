package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[1]);
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
            e.printStackTrace();

        }finally {
            System.out.println("Finally Block");
        }


    }
}

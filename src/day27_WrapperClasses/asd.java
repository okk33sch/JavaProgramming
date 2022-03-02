package day27_WrapperClasses;

public class asd {
    public static void main(String[] args) {
        String s = "77";

        // Primitive int is returned
        int str = Integer.parseInt(s);
        System.out.println(str);

        // Integer object is returned
        int str1 = Integer.valueOf("asd", 36);
        System.out.println(str1);


        int stringExample = Integer.parseInt("koray", 36);
        System.out.println(stringExample);
    }
}
package alumni_mentor_s_tasks;

public class SwapNumbers {
    // TODO create a void method which will swap 2 integer without creating third variable. This method will have 2 parameters.
    // int a = 3
    // int b = 5

    // num will become 5;
    // num1 will become 3;


    public static void swap(int a, int b){
        a = a + b; // 8
        b = a - b; // 5

        a = a - b; // 5

        System.out.println("a: " + a + " b: " + b);

    }

    public static void swapStrings(String a, String b){
        // a apple
        // b banana

        a = a + "" + b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("Word " + a + " word b: " + b);

    }


}

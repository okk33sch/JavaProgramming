package practice;

public class Ternaries {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int max;

        if(a > b){
            max = a;
        }else{
            max = b;
            System.out.println(max);
        }

        System.out.println("--------------------------------------------------------");

        int max2 = (a > b) ? a : b;

        System.out.println(max2);
    }
}


/*
Ternary:
    ? means if,, : means else

        (Condition)?    : if block
        :(Condition)?   : else if block
        :               : else block
 */
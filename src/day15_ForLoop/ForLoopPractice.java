package day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        //15 16 17 18 ..... 45

        /*
        System.out.print(15);
        System.out.print(16);
        ...
        System.out.print(45);
        */

        for(int i = 15; i <= 45; i ++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("1-----------------------------------------------------");

        //100 99 98 97 96 95 94 93 ... 50
        for(int i = 100; i > 50; i--){ // i: 10, 99 ....50  (>=, <=, >, <)
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("2-----------------------------------------------------");
        for(int n = 1; n <= 55; n ++){
            if(n%2 == 0){
                System.out.print(n + " ");
            }
        }
        System.out.println();
        System.out.println("3-----------------------------------------------------");

        for(int i = 2; i <= 54; i += 2){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("4-----------------------------------------------------");

    }
}

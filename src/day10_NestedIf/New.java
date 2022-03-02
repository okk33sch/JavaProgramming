package day10_NestedIf;

public class New {
    public static void main(String[] args) {

        boolean X = true;

        if(X == false){
            System.out.println("One");
        }else  if(X == false != true){
            System.out.println("Two");
        }else if (X == true){
            System.out.println("Three");
        }else if(X == !false){
            System.out.println("Four");
        }



    }
}

/*
    boolean resultA = 9 >= 9 || 10 <= 10,
            resultB = 'A' >= 128 && 'B' < 128;

                if(resultA){
                        if(resultB){
                        System.out.println(resultA);
                        }else{
                        System.out.println(resultB);
                        }
                        }

 */
/*
    int x = 1;
    int y = 0;
    if(x++ > ++y){
            System.out.println("Hello ");
            }else{
            System.out.println("Welcome ");
            }
            System.out.println("Log " + x + " : " + y);

 */
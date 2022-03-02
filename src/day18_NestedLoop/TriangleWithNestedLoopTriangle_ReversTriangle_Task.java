package day18_NestedLoop;

public class TriangleWithNestedLoopTriangle_ReversTriangle_Task {
    public static void main(String[] args) {

        String result = "";
        result = "* ";
        for (int j=0; j<=10;j++) {
            for (int i = 10; i >= j; i--) {

                System.out.print(result);

            }
            System.out.println();
        }

    }
}
/*
Use a nested loop to print the following shape
* * * * * * * * * * *
* * * * * * * * * *
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
 */

/*
for (int v = 0; j <= 10; j++) {
                for (int g = 0; g <= v; g++) {

                    System.out.print("* ");

                }
                System.out.println();
            }
 */
/*
String str = "*";
            String result = "";

            for (int k = 0; k < 9; k++) {
                result +=str.charAt(0)+" ";
                System.out.println(result);
 */

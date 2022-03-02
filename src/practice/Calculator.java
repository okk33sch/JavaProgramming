package practice;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10,
                n2 = 5;
        char mathOperator = '*';

        if(mathOperator == '-') {
            System.out.println(n1 - n2);
        }else if(mathOperator == '+'){
            System.out.println(n1 + n2);
        }else if(mathOperator == '/') {
            System.out.println(n1 / n2);
        }else if (mathOperator == '*'){
            System.out.println(n1 * n2);
        }
    }
}

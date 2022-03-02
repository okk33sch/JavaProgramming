package enginDemirog;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

    public static int add(int...nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return  sum;
    }
}
package interviewQuestions;

public class Factorial {
    public static void main(String[] args) {

        int num = 5; // !5 = 5*4*3*2*1

        long factorial = 1L;

        for(int i =5; i > 1; i--){
            factorial *= i; // 5, 20, 60, 120
        }
        System.out.println(factorial);
    }
}

package alumni_mentor_s_tasks;

public class FibonacciMethod {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    public static String fibonacci(int num) {
        String result = "";

        int [] nums = new int[num+1];
        nums[0] = 0;
        nums[1] = 1;
        System.out.print(nums[0]+" "+nums[1]+" ");
        for(int i = 2; i < num; i++){
            nums[i] = nums[i-2] + nums[i-1];
            result += nums[i]+" ";
        }
        return result;
    }
}

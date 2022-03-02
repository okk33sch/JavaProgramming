package alumni_mentor_s_tasks;

public class NthLargestNumberMikailSolution {
    public static void main(String[] args) {
        int[] arr = {475, 48, 1000, 769, 1, 3, 22, 44, 12, 30, 32, 1000, 54, 31};
        System.out.println("Second max is: " + secondMax(arr));

    }

    public static int secondMax(int[] arr){

        int max = arr[1]; // int max = 1;// these are random number range of index number
        int secondMax = arr[1]; // int secondMax = 2 // these are random number range of index number

        for (int i = 0; i < arr.length; i++) {  // max: 48
                                                // second max: 48
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }

        }
        return secondMax;
    }

}
package turquaz_Practice;

public class HulyaHanimSorusu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 3, 13, 5, 8, 4, 13, 13, 7, 13};
        Boolean skipNext = false;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 13 && skipNext) {
                //System.out.println("skipped " + arr[i]);
                skipNext = false;
            } else if (arr[i] == 13) {
                //System.out.println("found 13 " + arr[i]);
                skipNext = true;
            } else {
                //System.out.println("added to sum " + arr[i]);
                sum += arr[i]; //1 + 2 + 8 + 4 = 15
            }
        }
        System.out.println("sum = " + sum);
    }
}
/*
Question is if array has 13 and after 13 is there a number so for sum I need skip 13 and the number after 13

Like {2,4,13,5,1} In this array skip 13 and 5

And sum is 7 because 2+4+1

Or {1,2,3,13,4,3,13,2,4} skip 13 and each number comes after 13
 */
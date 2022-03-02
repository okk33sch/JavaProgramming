package alumni_mentor_s_tasks;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] a = {100, 450, 820, 400, 900, 900, 20, 200};
        int n = 2;

        System.out.println(n + "th max number is " + findMax(a, n));
    }

    public static int findMax(int[] arr, int num) {
        if (num > arr.length - 1 || num < 0) {
            System.err.println("invalid request " + num);
            System.exit(0);
        }

        int indexMax = 0;
        for (int k = 0; k < num; k++) {

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {      //  100,450,820,400,900,20,200
                if (arr[i] > max) {
                    max = arr[i];

                }

            }
            for (int m = 0; m < arr.length; m++) {
                if (arr[m] == max)
                    arr[m] = Integer.MIN_VALUE;
            }

            indexMax=max;
        }
        return indexMax;
    }

}

// TODO: Create a method which will return an integer (return type). This method will have an int array parameter.
// Return the number from that array which is the second highest num.


// TODO: Create a method which will return an Integer ArrayList. The method will accept an int array parameter.
// Return every even number which are in the Array.


// TODO Create a method which will Find the odd numbers from array and put them in the map one by one and return as a map type
package interviewQuestions;

import java.util.Arrays;

public class RemoveElementArrayNazir {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50, 60};
        int n = 2;

        remove(array,n);
    }

    public static int[] remove(int[] ar,int n){
        int[] newArr=new int[ar.length-1];
        int j=0;
        for (int i = 0; i < ar.length; i++) {
            if(i!=n){// 10 20 40
                newArr[j++]=ar[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;

    }

}
/*
10. create a method named removeElement
that passes one integer array and one integer,
 the method removes the integer index from the integer
  array and returns the new array
            Ex:
                array = {10, 20, 30, 40, 50, 60}
                index = 2
                removeElement(array, index) ==== {10, 20, 40, 50, 60}

 */
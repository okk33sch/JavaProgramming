package share_Your_Code;

import java.util.Scanner;

public class AlphabetPyramid{
    public static void main(String aliyeRona[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int count1 = 1;
        int count2 = 1;
        char ch = 'A';

        for (int i = 1; i < (n * 2); i++){
            for (int space = n - count2; space > 0; space--){
                System.out.print(" ");
            }
            if (i < n){
                count2++;
            }else{
                count2--;
            }
            for (int j = 0; j < count1; j++){
                System.out.print(ch);
                if (j < count1 / 2) {
                    ch++;
                }else{
                    ch--;
                }
            }
            if (i < n){
                count1 = count1 + 2;
            }else{
                count1 = count1 - 2;
            }
            ch = 'A';
            System.out.println();
        }
    }
}
package practice;

public class ArraysPracticeWithBurak2 {
    public static void main (String args[]) {

        int[][] M;
        M = new int[4][5];


        for (int row=0; row < 4; row++) {
            for (int col=0; col < 5; col++) {
                M[row][col] = row+col;
                System.out.print(M[row][col]+" ");

            }
            System.out.println();

        }
    }
}

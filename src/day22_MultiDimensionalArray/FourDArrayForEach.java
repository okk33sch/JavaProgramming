package day22_MultiDimensionalArray;

public class FourDArrayForEach {
    public static void main(String[] args) {
        int[][][][] arr4D = {{{ {1,2,3}, {4,5,6}, {7,8,9}}, {{10,20,30}, {40,50,60}, {70,80,90} }}};

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int element : each1D) {
                        System.out.print(element+" ");

                    }
                    System.out.println();

                }

            }

        }


    }



}

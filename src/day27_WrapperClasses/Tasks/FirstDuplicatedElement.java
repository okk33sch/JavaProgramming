package day27_WrapperClasses.Tasks;

import java.util.ArrayList;

public class FirstDuplicatedElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 6, 7, 7};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
// list.addAll(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 7, 7));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (Integer each : list) {
                if (each == list.get(i)) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(list.get(i));break;
            }
        }
    }
}

/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */
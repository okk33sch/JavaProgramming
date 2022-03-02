package day22_MultiDimensionalArray;

public class ReverseSentenceManasSolution {
    public static void main(String[] args) {
        String str = "Today is a good day to learn Java";
        String[] strSplit = str.split(" ");
        String strReverse = "";

        for (String each : strSplit) {
            strReverse = each + " " + strReverse;//
        }
        System.out.println(strReverse);
    }
}

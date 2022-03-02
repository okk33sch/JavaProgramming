package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class Test1 {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name = "Java Programming";
        String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);

    }
}

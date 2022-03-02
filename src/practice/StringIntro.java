package practice;

public class StringIntro {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Java";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);



        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("---------------------------------------------");

        String name = "wooden spoon"; // Immutable
        name = name.toUpperCase(); //"WOODEN SPOON'

        System.out.println(name);

    }
}

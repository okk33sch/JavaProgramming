package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = " ";
        boolean r = str.isEmpty();
        System.out.println(r);
        System.out.println("1--------------------------------");
        boolean r1 = str.isBlank();
        System.out.println(r1);
        System.out.println("2--------------------------------");
        String str2 = "Cydeo    ";
        System.out.println(str2.isBlank());
        System.out.println("3--------------------------------");
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        // Yes, YES, yEs, yES, YEs...
        System.out.println("yEs".equalsIgnoreCase("Yes"));
        System.out.println("4--------------------------------");
        String sentence = "My favorite programming language is Java";
        sentence.contains("Java");
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java"); // It has case sensitivity
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java"); // It is non sense
        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r3);
        System.out.println("5--------------------------------");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false
        System.out.println(input1.contains(input2));
        System.out.println(input1.contains("Java"));

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("6--------------------------------");
        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create the lower/upper case version of string and then compare it with lowercase/uppercase
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}

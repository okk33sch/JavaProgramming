package day24_CustomMethod_Return.Tasks;

public class Reverse {
    public static void main(String[] args) {
        String sentence = "You were the shadow to my light\n" +
                "Did you feel us\n" +
                "Another start\n" +
                "You fade away\n" +
                "Afraid our aim is out of sight\n" +
                "Wanna see us\n" +
                "Alive\n" +
                "Where are you now\n" +
                "Where are you now\n" +
                "Where are you now";

        System.out.println(reverse(sentence));
    }


    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }
        return reversed;

    }
}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ

 */

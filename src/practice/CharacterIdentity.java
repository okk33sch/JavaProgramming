package practice;

public class CharacterIdentity {
    public static void main(String[] args) {

        char character = 65; //  90 Asci table is : Z

        if (character >= 65 && character <= 90) {
            System.out.println("Alphabetic Upper case  character : " + character);
        } else if (character >= 97 && character <= 122) {
            System.out.println("Alphabetic Lower case character : " + character);
        } else if (character >= 48 && character <= 57) {
            System.out.println("Given number is a digit :" + character);

        } else {
            System.out.println("Special character " + character);
        }


    }
}

/*
Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */
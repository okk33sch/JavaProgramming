package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch = 'A'; // ==
        String result = "";

        switch (ch){
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
                break;
        }
        System.out.println(result);

        int x = 0, y = 0;
        switch (x+1){
            case 0: y=0;
            case 1: y=1;
            default:y = -1;

                System.out.println(y);
        }


    }
}


/*
3. a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid

 */
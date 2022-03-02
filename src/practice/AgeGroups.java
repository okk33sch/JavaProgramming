package practice;

public class AgeGroups {

    public static void main(String[] args) {

        int enterYourAge = 36;
        String ageGroup;
        if (enterYourAge >= 1 && enterYourAge <= 2) {
            ageGroup = "    Infant";
        } else if (enterYourAge >= 3 && enterYourAge <= 5) {
            ageGroup = "    Toddler";
        } else if (enterYourAge >= 6 && enterYourAge <= 9) {
            ageGroup = "    Kid";
        } else if (enterYourAge >= 10 && enterYourAge <= 12) {
            ageGroup = "    Pre-Teen";
        } else if (enterYourAge >= 13 && enterYourAge <= 17) {
            ageGroup = "    Teenager";
        } else if (enterYourAge >= 18 && enterYourAge <= 20) {
            ageGroup = "    Young Adult";
        } else if (enterYourAge >= 21 && enterYourAge <= 39) {
            ageGroup = "    Adult";
        } else if (enterYourAge >= 40 && enterYourAge <= 49) {
            ageGroup = "    Young Middle-Aged Adult";
        } else if (enterYourAge >= 50 && enterYourAge <= 54) {
            ageGroup = "    Middle-Aged Adult";
        } else if (enterYourAge >= 55 && enterYourAge <= 64) {
            ageGroup = "    Very Young Senior Citizen";
        } else if (enterYourAge >= 65 && enterYourAge <= 74) {
            ageGroup = "    Young Senior Citizen";
        } else if (enterYourAge >= 75 && enterYourAge <= 84) {
            ageGroup = "    Senior Citizen";
        } else if (enterYourAge >= 85) {
            ageGroup = "    Old Senior Citizen";
        } else {
            ageGroup = "unidentified";
        }
        System.out.println(ageGroup);
    }
}





/*

 */

/*
Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */

/*
    int ageGroup = 8;

        if (ageGroup >= 1 && ageGroup <= 2){
                System.out.println("Infant");
                }else if(ageGroup >= 3 && ageGroup <= 5){
                System.out.println("Toddler");
                }else if(ageGroup >= 6 && ageGroup <= 9){
                System.out.println("Kid");
                }else if(ageGroup >= 10 && ageGroup <= 12){
                System.out.println("Pre-Teen");
                }else if(ageGroup >= 13 && <= 17){
                System.out.println("Teenager");
                }else if (ageGroup >= 18 && ageGroup <= 20){
                System.out.println("Young Adult");
                }else if (ageGroup >= 21 && <= 39){
                System.out.println("Adult");
                }else if ()

 */
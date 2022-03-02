package practice;

public class AgeGroup2 {
    public static void main(String[] args) {

        int age = 86;

        String ageOfThePerson = (age >= 1 && age <= 2) ? "Infant" : (age >= 3 && age <= 5) ? "Toddler" : (age >= 6 && age <= 9) ? "Kid"
                : (age >= 10 && age <= 12) ? "Pre-Teen" : (age >= 13 && age <= 17) ? "Young adult" : (age >= 18 && age <= 20) ? "Young Adult"
                : (age >= 21 && age <= 39) ? "Adult" : (age >= 40 && age <= 49) ? "Young Middle Aged adult"
                : (age >= 50 && age <= 54) ? "Middle Aged Adult" : (age >= 55 && age <= 64) ? "Very Young Senior Adult"
                : (age >= 65 && age <= 74) ? "Young Senior Citizen" : (age >= 75 && age <= 84) ? "Senior Citizen" :
                "Old Senior Citizen";


        System.out.println("Age  " + age + " : " + ageOfThePerson);


    }
}
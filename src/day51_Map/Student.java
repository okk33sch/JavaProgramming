package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class Student {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Ahmet", 75);
        students.put("Mehmet", 100);
        students.put("Ali", 79);
        students.put("Osman", 70);
        students.put("Omer", 100);

        Map<String, Integer> lessThan80 = new HashMap<>();
        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value < 80){
                lessThan80.put(key, value);
            }
        }
        System.out.println("lessThan80 = " + lessThan80);

        System.out.println("--------------------------------------------------");

        Map <String, String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("Ethiopia", "Addis Ababa");
        countriesAndCapitals.put("Cape Verde", "Praia");
        countriesAndCapitals.put("Burkina Faso", "Ouagadougou");
        countriesAndCapitals.put("Papua New Guinea", "Port Moresby");
        countriesAndCapitals.put("Guinea-Bissau", "Bissau");
        countriesAndCapitals.put("Mongolia", "Ulaanbaatar");

        for (String capitals : countriesAndCapitals.keySet()) {
            System.out.println("Capitals of Countries = " + capitals);

        }

    }
}
/*
 1. create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80


    2. create a map that can contain names of countries and their capitals
                use for each loop to print out all the capitals
 */

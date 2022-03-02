package day34_GarbageCollection_AccessModifiers.Tasks;

public class Person {

    public String name,Language;
    public int age;
    public char gender;


    public static String planet;
    public static boolean isHuman;
    public static boolean  hasNose ;
    public static int  numberOfWings;
    public static int  numberOfHead;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        Language = language;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Language='" + Language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    static {

        planet="EARTH";
        isHuman=true;
        hasNose =true;
        numberOfWings=0;
        numberOfHead=1;

    }

    public static void printPlanetName( ) {
        System.out.println(planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public static void main(String[] args) {

        Person person1=new Person("PINOKIO","Turkish",30,'M');


        System.out.println(person1);
        person1.drink("water");
        person1.eat("hamburger");
        person1.printPlanetName();

    }
}
/*
    2. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */
package day34_GarbageCollection_AccessModifiers.Tasks;

public class Dog {


    public String breed;
    public String size ;
    public String color;
    public int age;
    public char gender;
    public  boolean isFriendly;

    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;


    public Dog(String breed, String size, String color, int age, char gender, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.isFriendly = isFriendly;
    }

    static{
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;

    }

    public static void eat(String dogname) {
        System.out.println(dogname+ " is eating food");
    }

    public static void bark(String dogname) {
        System.out.println(dogname+ " is barking");
    }

    public static void drink(String dogname) {
        System.out.println(dogname+" is drinking");
    }

    public static void play(String dogname) {
        System.out.println(dogname+ " is barking");
    }

    public static void sleep(String dogname){
        System.out.println(dogname+"is sleeping");
    }


    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isFriendly=" + isFriendly +
                '}';
    }

    public static void main(String[] args) {
        Dog animal=new Dog("GermanShepherd","Large","Brown",4,'M',true);


        System.out.println(animal);

        System.out.println("How many eyes he has ? :" + numberOfEyes);
        System.out.println("How many wings he has ? : " + numberOfWings);
        System.out.println("How many legs he has ? : "+ numberOfLegs);

        animal.bark("Dusty");
        animal.play("Dusty");
        animal.drink("Dusty");
        animal.eat("Dusty");

    }
}
/*
1. Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */

package practice.krals;

 public class PrivateClass {
    private String name;
    private int age, id;
    private char gender;

    public PrivateClass(String name, int age, int id, char gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }


    public String toString() {
        return "PrivateClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }



}

package day31_Constructors.Tasks;

public class Athlete {
    public String athleteName;
    public double athleteSpeed;
    public int athleteAge;

//    public void setInfo (String athleteName, double athleteSpeed, int athleteAge) {
//        this.athleteName = athleteName;
//        this.athleteSpeed = athleteSpeed;
//        this.athleteAge = athleteAge;
//    }


    public Athlete(String athleteName, double athleteSpeed, int athleteAge) {
        this.athleteName = athleteName;
        this.athleteSpeed = athleteSpeed;
        this.athleteAge = athleteAge;
    }



    public String toString() {
        return "Athlete{" +
                "athleteName='" + athleteName + '\'' +
                ", athleteSpeed=" + athleteSpeed + "km/h" +
                ", athleteAge=" + athleteAge +
                '}';
    }

    public static void main(String[] args) {
//        System.out.println(Athlete.athleteName);
//        System.out.println(Athlete.athleteSpeed);
//        System.out.println(Athlete.athleteAge);

        Athlete athlete = new Athlete("husain", 200.5, 20 );
        System.out.println(athlete);

    }






}

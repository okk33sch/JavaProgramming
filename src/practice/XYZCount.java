package practice;

public class XYZCount {

    public static void main(String[] args) {

        int x,y,z;
        int count = 0;

        for (x=1; x<=4; x++){
            for(y=1; y<=4; y++){
                for(z=1; z<=4; z++){
                    count++;
                    if(x!=y && y!=z && x!=z){
                        System.out.println(x+ " "+ y + " "+ z);
                    }
                }
            }
        }
        System.out.println("count = " + count);


    }
}

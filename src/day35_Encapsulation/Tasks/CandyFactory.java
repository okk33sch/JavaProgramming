package day35_Encapsulation.Tasks;

import java.util.ArrayList;

public class CandyFactory {
    public static void main(String[] args) throws Exception {
        ArrayList<Candy> candies = new ArrayList();
        candies.add(new Candy("TopiTop", 1,0.99,true));
        candies.add(new Candy("LolliPop", 2,1.98,false));
        candies.add(new Candy("Rocco", -1,0.0,true));
        candies.add(new Candy("PopRocks", 4,3.96,true));
        candies.add(new Candy("Smarties", 5,0,false));

        for (Candy candy : candies) {
            String price = candy.getPrice() > 0 ? "$" + candy.getPrice() : "Free";
            String quantity = candy.getQuantity() > 0 ? ""+ candy.getQuantity() : "Quantity must be greater than zero!";
            System.out.println(quantity + " " + candy.getBrand() + " : " + price);
        }
    }
}

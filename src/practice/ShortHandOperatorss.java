package practice;

import java.text.DecimalFormat;

public class ShortHandOperatorss {

    public static void main(String[] args) {
        double availableBalance = (Math.random()*1500);
        DecimalFormat df = new DecimalFormat("#####.##");
        String formatted = df.format(availableBalance);

        System.out.println("Former Balance: $"+formatted);

        availableBalance += 300;
        System.out.println("New Balance: $"+formatted);

    }
}
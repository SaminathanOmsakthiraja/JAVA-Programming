import java.util.*;
public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bkcls = sc.next();
        int days = sc.nextInt();
        double stavb = sc.nextDouble();
        String rtype = sc.next();

        double base = 0,mul = 0;
        String cat = "";

        if (bkcls.equals("Economy")){
            if (rtype.equals("Domestic"))
                base = 200;
            else if (rtype.equals("International-Short"))
                base = 500;
            else if (rtype.equals("International-Long"))
                base = 800;
        }
        else if (bkcls.equals("Business")){
            if (rtype.equals("Domestic"))
                base = 600;
            else if (rtype.equals("International-Short"))
                base = 1500;
            else if (rtype.equals("International-Long"))
                base = 2500;
        }
        else if (bkcls.equals("First")){
            if (rtype.equals("Domestic"))
                base = 1000;
            else if (rtype.equals("International-Short"))
                base = 3000;
            else if (rtype.equals("International-Long"))
                base = 5000;
        }

        if (stavb < 30 && days < 14){
            mul = 1.8;
            cat = "High Demand";
        }
        else if (stavb < 50 && days < 30){
            mul = 1.5;
            cat = "High Demand";
        }
        else if (stavb < 60 || (days > 30 && days < 60)){
            mul = 1.0;
            cat = "Moderate";
        }
        else if (stavb >= 60 && days >= 60){
            mul = 0.8;
            cat = "Low Demand";
        }

        System.out.println();
        System.out.println("Booking Class: " + bkcls);
        System.out.println("Days Until Departure: " + days);
        System.out.println("Seats Availability: " + stavb + "%");
        System.out.println("Route Type: " + rtype);
        System.out.println("Base Price: $" + base);
        System.out.println("Demand Multiplier: " + mul + "X");
        System.out.println("Final Ticket Price: $" + base * mul);
        System.out.println("Pricing Category: " + cat);

        sc.close();
    }
}

import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loctier = sc.next();
        int sq = sc.nextInt();
        int age = sc.nextInt();
        int score = sc.nextInt();
        
        int per = 0;
        double amt = 0,val = 0;
        String catg = " ";

        double base =0;

        if (loctier.equals("Prime"))
            base = 400;
        else if (loctier.equals("Urban"))
            base = 300;
        else if (loctier.equals("Suburban"))
            base = 180;
        else if (loctier.equals("Rural"))
            base = 100;
        
        double baseVal = sq * base;
        
        if (age >= 0 && age <= 5) 
            per = 0;
        else if (age >= 6 && age <= 15) {
            if (age <= 10)
                per = -5;
            else
                per = -10;
        } else if (age >= 16 && age <= 30) {
            if (age <= 20)
                per = -15;
            else
                per = -20;
        } else {
            if (age <= 40)
                per = -25;
            else
                per = -35;
        }

        double adjVal = baseVal * (1 + per / 100.0);
        
        if (score >= 80 && score <=100)
            amt += adjVal*0.1;
        else if (score >= 60 && score < 80)
            amt += adjVal*0.05;
        else if (score >= 40 && score < 60)
            amt += adjVal*0.02;
        else if (score < 40)
            amt = 0;


        val = adjVal + amt ;

        if ((loctier.equals("Prime") || loctier.equals("Urban")) && age < 15)
            catg = "Hot";
        else if (loctier.equals("Suburban"))
            catg = "Stable";
        else
            catg = "Slow";


        System.out.println("Location Tier: " + loctier);
        System.out.println("Square Footage: " + sq +" sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + score);
        System.out.println("Base Price Per Sq Ft: $" + base);
        System.out.println("Age Adjustment: " + per +"%");
        System.out.println("Amenity Bonus: $" + amt);
        System.out.println("Estimated Property Value: $" + val);
        System.out.println("Market Category: " + catg);

        sc.close();
    }
}

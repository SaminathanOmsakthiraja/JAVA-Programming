import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String type = sc.next();
        String rec = sc.next();
        String cov = sc.next();

        System.out.println("Driver Age: " + age);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Driver Record: " + rec);
        System.out.println("Coverage Level: " + cov);

        double base = 0;
        if (cov.equals("Basic")) 
            base = 500;
        else if (cov.equals("Standard")) 
            base = 800;
        else if (cov.equals("Comprehensive")) 
            base = 1500;

        System.out.println("Base Premium: $" + base);

        double ageFactor = 0;
        if (age >= 16 && age <= 21) 
            ageFactor = 1.8;
        else if (age > 21 && age <= 25) 
            ageFactor = 1.5;
        else if (age > 25 && age <= 40) 
            ageFactor = 1.0;
        else if (age > 40 && age <= 60) 
            ageFactor = 0.9;
        else if (age > 60)
            ageFactor = 1.1;

        System.out.println("Age Factor: " + ageFactor + "x");

        double riskFactor = 0;
        if (type.equals("Sedan")) 
            riskFactor = 1.0;
        else if (type.equals("SUV")) 
            riskFactor = 1.2;
        else if (type.equals("Truck")) 
            riskFactor = 1.5;

        System.out.println("Vehicle Risk Factor: " + riskFactor + "x");

        int recordadjustment = 0;
        if (rec.equals("Clean")) 
            recordadjustment = -10;
        else if (rec.equals("Minor-Violations")) 
            recordadjustment = 25;
        else if (rec.equals("Major-Violations")) 
            recordadjustment = 50;

        System.out.println("Record Adjustment: " + recordadjustment + "%");

        //double adjusedPremium = base * ageFactor * riskFactor;
        double finalPremium = base * ageFactor * riskFactor * (1 + recordadjustment / 100);
        double monthlypremium = finalPremium / 12;

        System.out.printf("Monthly Premium: $%.2f\n", monthlypremium);
        System.out.printf("Annual Premium: $%.1f\n", finalPremium);

        String riskLevel = "";
        if (finalPremium > 2000) 
            riskLevel = "High";
        else if (finalPremium > 1000) 
            riskLevel = "Medium";
        else 
            riskLevel = "Low";

        System.out.println("Risk Category: " + riskLevel);

        sc.close();
    }
}

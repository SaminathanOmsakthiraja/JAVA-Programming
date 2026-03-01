import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentsts = sc.next();
        int credithrs = sc.nextInt();
        String programtyp = sc.next();
        String residency = sc.next();

        System.out.println("Student Status: " + studentsts);
        System.out.println("Credit Hours: " + credithrs);
        System.out.println("Program Type: " + programtyp);
        System.out.println("Residency Status: " + residency);

        double basefee = 0;
        if (programtyp.equals("Undergraduate"))
            basefee = 350;
        else if (programtyp.equals("Graduate"))
            basefee = 550;
        else if (programtyp.equals("Professional"))
            basefee = 800;
        System.out.println("Base Tuition Fee: $" + basefee);

        double multiplier = 0;
        if (residency.equals("In-State"))
            multiplier = 1.0;
        else if (residency.equals("Out-of-State"))
            multiplier = 2.5;
        else if (residency.equals("International"))
            multiplier = 3.0;
        System.out.println("Residency Multiplier: " + multiplier + "x");

        double programfee = 0;
        if (studentsts.equals("Full-Time")){
            if (programtyp.equals("Undergraduate"))
                programfee = 500;
            else if (programtyp.equals("Graduate"))
                programfee = 750;
            else if (programtyp.equals("Professional"))
                programfee = 1200;
        }
        else if (studentsts.equals("Part-Time")){
            if (programtyp.equals("Undergraduate"))
                programfee = 300;
            else if (programtyp.equals("Graduate"))
                programfee = 750;
            else if (programtyp.equals("Professional"))
                programfee = 900;
        }
        else if (studentsts.equals("Continuing-Education"))
            programfee = 150;
        System.out.println("Program Fee: $" + programfee);

        double activityfee = 0;
        if (studentsts.equals("Full-Time"))
            activityfee = 200;
        else if (studentsts.equals("Part-Time"))
            activityfee = 100;
        else if (studentsts.equals("Continuing-Education"))
            activityfee = 50;
        System.out.println("Student Activity Fee: $" + activityfee);

        double tuitionfee = basefee * multiplier * credithrs;
        double totalfee = tuitionfee + programfee + activityfee;
        System.out.println("Total Registration Fee: $" + totalfee);

        String feecategory = "";
        if (programtyp.equals("In-State") && residency.equals("Full-Time"))
            feecategory = "Standard";
        else if (residency.equals("Continuing-Education"))
            feecategory = "Reduced";
        else if (programtyp.equals("International") || programtyp.equals("Out-of-State"))
            feecategory = "Premium";
        System.out.println("Fee Category: " + feecategory);

        sc.close();
    }
}

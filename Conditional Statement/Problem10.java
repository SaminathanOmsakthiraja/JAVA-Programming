import java.util.*;
public class Problem9 Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String timeofday = sc.next();
        double powcon = sc.nextDouble();
        double renewper = sc.nextDouble();
        String ratetire = sc.next();

        double base = 0;
        if (ratetire.equals("Basic"))
            base = 0.18;
        else if (ratetire.equals("Time-of-Use"))
            base = 0.15;
        else if (ratetire.equals("Premium-Green"))
            base = 0.12;

        double rate = 0;
        if (timeofday.equals("Peak"))
            rate = 1.5;
        else if (timeofday.equals("Off-Peak"))
            rate = 0.8;
        else if (timeofday.equals("Super-Off-Peak"))
            rate = 0.5;

        double renewcrd = (powcon * renewper / 100) * base;
        double cost = (powcon * base * rate) - renewcrd;

        String reco = " ";
        if ( timeofday.equals("Peak") && renewper < 10)
            reco = "Shift to Off-Peak";
        else if (renewper >= 80)
            reco = "Ecellent! Continue";
        else if ( timeofday.equals("Baisc") && renewper >= 80)
            reco = "Upgrade to Time-of-Use";

        double potential = 0;
        if (timeofday.equals("Peak"))
            potential = (base * base) * 100;

        System.out.println("Time of Day: " + timeofday);
        System.out.println("Power Consumption: " + powcon + " kWh");
        System.out.println("Renewable Energy: " + renewper + "%");
        System.out.println("Rate Tier: " + ratetire);
        System.out.println("Base Rate: $" + base + "/kWh");
        System.out.println("Rate Multiplier: " + rate + "x");
        System.out.println("Renewable Credit: $" + renewcrd);
        System.out.printf("Total Cost: $%.2f%n", cost);
        System.out.println("Optimization Recommendation: " + reco);
        System.out.println("Potential Savings: $" + potential);

        sc.close();
    }
}

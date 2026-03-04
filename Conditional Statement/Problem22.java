import java.util.*;

public class Problem22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        sc.nextLine();
        String customerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();

        double tier1 = 0, tier2 = 0, tier3 = 0, tier4 = 0;
        double rate1 = 0, rate2 = 0, rate3 = 0, rate4 = 0;
        double seasonalAdjustment = 0;
        double paymentDiscount = 0;

        if (customerType.equals("Residential")) {
            rate1 = 0.10;
            rate2 = 0.15;
            rate3 = 0.25;
            rate4 = 0.30;
        } 
        else if (customerType.equals("Commercial")) {
            rate1 = 0.12;
            rate2 = 0.18;
            rate3 = 0.25;
            rate4 = 0.25;
        } 
        else if (customerType.equals("Industrial")) {
            rate1 = 0.08;
            rate2 = 0.12;
            rate3 = 0.20;
            rate4 = 0.20;
        }

        if (units > 0) {
            if (units <= 100) {
                tier1 = units * rate1;
            } 
            else {
                tier1 = 100 * rate1;

                if (units <= 300) {
                    tier2 = (units - 100) * rate2;
                } 
                else {
                    tier2 = 200 * rate2;

                    if (units <= 500) {
                        tier3 = (units - 300) * rate3;
                    } 
                    else {
                        tier3 = 200 * rate3;
                        tier4 = (units - 500) * rate4;
                    }
                }
            }
        }

        double subtotal = tier1 + tier2 + tier3 + tier4;

        if (season.equals("Summer")) {
            seasonalAdjustment = 15;
        } 
        else if (season.equals("Winter")) {
            seasonalAdjustment = -10;
        } 
        else {
            seasonalAdjustment = 0;
        }

        double afterSeason = subtotal * (1 + seasonalAdjustment / 100.0);

        if (paymentMethod.equals("Auto-Pay")) {
            paymentDiscount = 5;
        } 
        else if (paymentMethod.equals("Online")) {
            paymentDiscount = 3;
        } 
        else {
            paymentDiscount = 0;
        }

        double totalBill = afterSeason * (1 - paymentDiscount / 100.0);

        double averageRate = 0;
        if (units > 0) {
            averageRate = totalBill / units;
        }

        System.out.println("Units Consumed: " + units + " kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1);
        System.out.println("Tier 2 Cost (101-300): $" + tier2);
        System.out.println("Tier 3 Cost (301-500): $" + tier3);
        System.out.println("Tier 4 Cost (501+): $" + tier4);
        System.out.println("Seasonal Adjustment: " + (int)seasonalAdjustment + "%");
        System.out.println("Payment Discount: " + (int)paymentDiscount + "%");
        System.out.println("Total Bill: $" + Math.round(totalBill * 100.0) / 100.0);
        System.out.println("Average Rate: $" + 
            Math.round(averageRate * 100.0) / 100.0 + "/kWh");

        sc.close();
    }
}

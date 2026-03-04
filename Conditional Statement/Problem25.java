import java.util.*;

public class Problem25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine();
        String international = sc.nextLine();
        String device = sc.nextLine();

        String planName = "";
        String category = "";
        double baseCost = 0;
        double dataOverage = 0;
        double callOverage = 0;
        double internationalFee = 0;
        double deviceFee = 0;
        double savings = 0;

        if (dataGB <= 2) {
            planName = "Basic 2GB";
            baseCost = 25;
            category = "Budget";
            if (dataGB > 2) {
                dataOverage = (dataGB - 2) * 10;
            }
        } 
        else if (dataGB <= 5) {
            planName = "Standard 5GB";
            baseCost = 40;
            category = "Standard";
            if (dataGB > 5) {
                dataOverage = (dataGB - 5) * 10;
            }
        } 
        else if (dataGB <= 25) {
            planName = "Premium Unlimited";
            baseCost = 70;
            category = "Premium";
        } 
        else {
            planName = "Unlimited Max";
            baseCost = 90;
            category = "Unlimited";
        }

        if (callMinutes > 1000 && category.equals("Standard")) {
            callOverage = (callMinutes - 1000) * 0.1;
        }

        if (international.equals("Light")) {
            internationalFee = 5;
        } 
        else if (international.equals("Moderate")) {
            internationalFee = 15;
        } 
        else if (international.equals("Heavy")) {
            internationalFee = 30;
        }

        if (device.equals("Smartphone")) {
            deviceFee = 10;
        } 
        else if (device.equals("Tablet")) {
            deviceFee = 10;
        } 
        else if (device.equals("Hotspot")) {
            deviceFee = 20;
        }

        double total = baseCost + dataOverage + callOverage + internationalFee + deviceFee;

        if (category.equals("Standard") && dataGB > 5) {
            savings = 5;
        }

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + international);
        System.out.println("Device Type: " + device);
        System.out.println("Recommended Plan: " + planName);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + total);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + category);

        sc.close();
    }
}

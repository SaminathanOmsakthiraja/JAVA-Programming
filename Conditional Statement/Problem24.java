import java.util.*;

public class Problem24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        String weather = sc.nextLine();

        double baseFee = 3.0;
        double distanceSurcharge = distance;
        double peakSurcharge = 0;
        double weatherSurcharge = 0;
        double discount = 0;

        if (timeSlot.equals("Breakfast")) {
            peakSurcharge = 0;
        } 
        else if (timeSlot.equals("Lunch")) {
            peakSurcharge = 2.5;
        } 
        else if (timeSlot.equals("Dinner")) {
            peakSurcharge = 2.0;
        } 
        else if (timeSlot.equals("Late-Night")) {
            peakSurcharge = 1.5;
        }

        if (weather.equals("Rain")) {
            weatherSurcharge = 2;
        } 
        else if (weather.equals("Snow")) {
            weatherSurcharge = 3;
        } 
        else if (weather.equals("Storm")) {
            weatherSurcharge = 5;
        }

        if (orderValue >= 75) {
            discount = 5;
        } 
        else if (orderValue >= 50) {
            discount = 3;
        } 
        else if (orderValue >= 30) {
            discount = 1;
        }

        double finalFee = baseFee + distanceSurcharge + peakSurcharge + weatherSurcharge - discount;

        if (finalFee < 2.99) {
            finalFee = 2.99;
        }

        int estimatedTime = (int)(distance * 8);

        if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            estimatedTime += 10;
        }

        if (weather.equals("Rain")) {
            estimatedTime += 5;
        } 
        else if (weather.equals("Snow")) {
            estimatedTime += 10;
        } 
        else if (weather.equals("Storm")) {
            estimatedTime += 15;
        }

        String priority = "";

        if (orderValue > 60) {
            priority = "Express";
        } 
        else if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            priority = "High";
        } 
        else {
            priority = "Standard";
        }

        System.out.println("Delivery Distance: " + distance + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weather);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + estimatedTime + " minutes");
        System.out.println("Service Priority: " + priority);

        sc.close();
    }
}

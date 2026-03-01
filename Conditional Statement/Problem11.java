import java.util.*;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ordertype = sc.next();
        String loyalstatus = sc.next();
        double orderval = sc.nextDouble();
        String timeslot = sc.next();

        int base = 0;

        if (loyalstatus.equals("Gold"))
            base = 15;
        else if (loyalstatus.equals("Silver"))
            base = 10;
        else if (loyalstatus.equals("Bronze"))
            base = 5;
        else if (loyalstatus.equals("None"))
            base = 0;

        int timebase = 0;
        if (timeslot.equals("Peak"))
            timebase += 0;
        else if (timeslot.equals("Regular"))
            timebase += 0;
        else if (timeslot.equals("Late-Night"))
            timebase -= 5;

        double servicefee = 0;
        if (ordertype.equals("Delivery"))
            servicefee = orderval * 0.1;
        else if (ordertype.equals("Takeout"))
            servicefee = orderval * 0.03;

        double discountval = orderval * (1 - (base + timebase) / 100.0);
        double finalval = discountval + servicefee;
        String kitchen = "";
        if (ordertype.equals("Delivery") && timeslot.equals("Peak"))
            kitchen = "High";
        else if (timeslot.equals("Regular"))
            kitchen = "Medium";
        else if (timeslot.equals("Late-Night"))
            kitchen = "Low";

        int pre = 0;
        if (ordertype.equals("Delivery") && kitchen.equals("High")) 
            pre = 25;
        else if (ordertype.equals("Dine-In") && kitchen.equals("Medium")) 
            pre = 20;
        else if (ordertype.equals("Takeout") && kitchen.equals("Low")) 
            pre = 15;
        else if (timeslot.equals("Late-Night")) 
            pre = 10;
        
        System.out.println("Order Type: " + ordertype);
        System.out.println("Loyalty Status: " + loyalstatus);
        System.out.println("Order Value: $" + orderval);
        System.out.println("Time Slot: " + timeslot);
        System.out.println("Base Discount: " + base + "%");
        System.out.println("Time-based Adjustment: " + timebase + "%");
        System.out.printf("Service Fee: $%.2f\n", servicefee);
        System.out.println("Final Amount: $" + finalval);
        System.out.println("Kitchen Priority: " + kitchen);
        System.out.println("Estimated Prep Time: " + pre + " minutes");

        sc.close();
    }
}

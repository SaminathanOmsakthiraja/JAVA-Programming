import java.util.*;

public class Problem11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double originalTotal = 0;
        double finalTotal = 0;

        for (int i = 1; i <= n; i++) {

            String seatType = sc.next();
            String customerType = sc.next();

            double basePrice = 0;
            int discount = 0;

            if (seatType.equals("Regular"))
                basePrice = 12;
            else if (seatType.equals("Premium"))
                basePrice = 18;
            else
                basePrice = 25;

            if (customerType.equals("Adult"))
                discount = 0;
            else if (customerType.equals("Child"))
                discount = 30;
            else
                discount = 25;

            double ticketFinal = basePrice - (basePrice * discount / 100.0);

            originalTotal += basePrice;
            finalTotal += ticketFinal;

            System.out.println("Ticket " + i + ": " + seatType + " - " + customerType);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + ticketFinal);
            System.out.println();
        }

        int groupApplied = 0;

        if (n >= 5) {
            finalTotal = finalTotal - (finalTotal * 0.10);
            groupApplied = 1;
        }

        double totalDiscount = originalTotal - finalTotal;

        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + originalTotal);
        System.out.printf("Total Discount: $%.1f\n" , totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + ((groupApplied == 1) ? "Yes" : "No"));

        sc.close();
    }
}
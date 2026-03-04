import java.util.*;
public class Problem10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double subtotal = 0;
        int totalItems = 0;

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            double itemTotal = price * qty;

            subtotal += itemTotal;
            totalItems += qty;

            System.out.println("Item: " + name);
            System.out.println("Price: $" + price + " x " + qty);
            System.out.println("Subtotal: $" + itemTotal);

            if (i != n - 1)
                System.out.println();
        }

        double tax = subtotal * 0.08;
        double serviceCharge = subtotal * 0.10;
        double grandTotal = subtotal + tax + serviceCharge;

        System.out.println();
        System.out.println("Total Items: " + totalItems);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (8%): $" + tax);
        System.out.println("Service Charge (10%): $" + serviceCharge);
        System.out.println("Grand Total: $" + grandTotal);

        sc.close();
    }
}
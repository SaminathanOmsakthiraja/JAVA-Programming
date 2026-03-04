import java.util.*;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double total = 0;
        double totaldis = 0;
        double save = 0;

        for (int i = 0; i < n; i++) {

            String prdname = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            System.out.println("Product: " + prdname);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + qty);

            int dis = 0;

            if (qty == 1)
                dis = 0;
            else if (qty >= 2 && qty <= 4)
                dis = 10;
            else if (qty >= 5 && qty <= 9)
                dis = 15;
            else
                dis = 20;
            save += dis;
            System.out.println("Discount: " + dis + "%");

            double subtotal = price * qty;
            double discountAmount = subtotal * dis / 100.0;
            double sub = subtotal - discountAmount;

            System.out.println("Subtotal: $" + sub + "\n");

            total += subtotal;
            totaldis += discountAmount;
        }

        System.out.println("Total Items: " + n);
        System.out.println("Original Total: $" + total);
        System.out.println("Total Discount: $" + totaldis);
        System.out.println("Final Total: $" + (total - totaldis));
        System.out.println("Savings: " + save + "%");

        sc.close();
    }
}
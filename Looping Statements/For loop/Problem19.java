import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int active = 0, soon = 0, expired = 0;

        for(int i=0;i<n;i++){

            String id = sc.next();
            String type = sc.next();
            int used = sc.nextInt();

            int period = 0;

            if(type.equalsIgnoreCase("Electronics"))
                period = 12;
            else if(type.equalsIgnoreCase("Appliance"))
                period = 24;
            else if(type.equalsIgnoreCase("Computer"))
                period = 36;

            int remaining = period - used;

            if(remaining < 0)
                remaining = 0;

            String status = "";

            if(remaining == 0){
                status = "Expired";
                expired++;
            }
            else if(remaining <= 3){
                status = "Expiring Soon";
                soon++;
            }
            else{
                status = "Active";
                active++;
            }

            System.out.println("Product ID: " + id);
            System.out.println("Type: " + type);
            System.out.println("Warranty Period: " + period + " months");
            System.out.println("Months Used: " + used);
            System.out.println("Remaining: " + remaining + " months");
            System.out.println("Status: " + status);
            System.out.println();
        }

        System.out.println("Total Products: " + n);
        System.out.println("Active Warranties: " + active);
        System.out.println("Expiring Soon: " + soon);
        System.out.println("Expired Warranties: " + expired);

        sc.close();
    }
}
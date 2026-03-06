import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int urgent = 0;
        double total = 0;

        for(int i=0; i<n; i++){

            String name = sc.next();
            String type = sc.next();
            int days = sc.nextInt();

            double fee = 0;
            int discount = 0;
            String priority = "";

            if(type.equalsIgnoreCase("Basic"))
                fee = 50;
            else if(type.equalsIgnoreCase("Premium"))
                fee = 100;
            else if(type.equalsIgnoreCase("VIP"))
                fee = 200;

            if(days >= 45)
                discount = 20;
            else if(days >= 30)
                discount = 15;
            else if(days >= 15)
                discount = 10;
            else
                discount = 0;

            if(days < 10){
                priority = "Urgent";
                urgent++;
            }
            else if(days <= 30)
                priority = "High";
            else
                priority = "Normal";

            double finalfee = fee * (1 - discount/100.0);

            total += finalfee;

            System.out.println("Member: " + name);
            System.out.println("Membership: " + type);
            System.out.println("Days Until Expiry: " + days);
            System.out.printf("Renewal Fee: $%.1f\n",fee);
            System.out.println("Discount: " + discount + "%");
            System.out.printf("Final Fee: $%.1f\n",finalfee);
            System.out.println("Priority: " + priority);
            System.out.println();
        }

        double avg = total/n;

        System.out.println("Total Members: " + n);
        System.out.println("Urgent Renewals: " + urgent);
        System.out.printf("Total Renewal Revenue: $%.1f\n",total);
        System.out.printf("Average Renewal Fee: $%.1f\n",avg);

        sc.close();
    }
}
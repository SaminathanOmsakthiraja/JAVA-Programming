import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double total = 0;
        int overdue = 0;

        for(int i=0;i<n;i++){

            String type = sc.next();
            int days = sc.nextInt();

            double rate = 0, cap = 0;

            if(type.equalsIgnoreCase("Regular")){
                rate = 0.5;
                cap = 10;
            }
            else if(type.equalsIgnoreCase("Reference")){
                rate = 1.0;
                cap = 20;
            }
            else if(type.equalsIgnoreCase("Magazine")){
                rate = 0.25;
                cap = 5;
            }

            double calc = days * rate;
            double actual = Math.min(calc,cap);

            if(days > 0)
                overdue++;

            total += actual;

            System.out.println("Book " + (i+1) + ": " + type);
            System.out.println("Days Late: " + days);
            System.out.printf("Daily Fine: $%.2f\n",rate);
            System.out.printf("Calculated Fine: $%.2f\n",calc);
            System.out.printf("Actual Fine: $%.2f\n",actual);
            System.out.printf("Cap Applied: %s\n\n",(calc>cap)?"Yes":"No");
        }

        double avg = total/n;

        System.out.println("Total Books: " + n);
        System.out.printf("Total Fines Collected: $%.2f\n",total);
        System.out.println("Books Overdue: " + overdue);
        System.out.printf("Average Fine: $%.2f\n",avg);

        sc.close();
    }
}
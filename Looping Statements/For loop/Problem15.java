import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double totaldist = 0;
        double totalrev = 0;

        for(int i=0;i<n;i++){

            double dist = sc.nextDouble();
            String time = sc.next();

            double base = 3;
            double distcharge = dist * 1;
            double surcharge = 0;

            if(time.equalsIgnoreCase("Evening"))
                surcharge = 3;
            else if(time.equalsIgnoreCase("Night"))
                surcharge = 5;

            double totalfare = base + distcharge + surcharge;

            totaldist += dist;
            totalrev += totalfare;

            System.out.println("Ride " + (i+1));
            System.out.printf("Distance: %.1f km\n",dist);
            System.out.println("Time: " + time);
            System.out.printf("Base Fare: $%.1f\n",base);
            System.out.printf("Distance Charge: $%.1f\n",distcharge);
            System.out.printf("Time Surcharge: $%.1f\n",surcharge);
            System.out.printf("Total Fare: $%.1f\n\n",totalfare);
        }

        double avg = totalrev/n;

        System.out.println("Total Rides: " + n);
        System.out.printf("Total Distance: %.1f km\n",totaldist);
        System.out.printf("Total Revenue: $%.1f\n",totalrev);
        System.out.printf("Average Fare: $%.2f\n",avg);

        sc.close();
    }
}
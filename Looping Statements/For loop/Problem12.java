import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int peak = 0;
        double total = 0;

        for(int i=0; i<n; i++){
            String type = sc.next();
            double hrs = sc.nextDouble();

            double hrsrate = 0, cap = 0;

            if (type.equalsIgnoreCase("Car")){
                hrsrate = 3;
                cap = 30;
            }
            else if (type.equalsIgnoreCase("Motorcycle")){
                hrsrate = 2;
                cap = 20;
            }   
            else if (type.equalsIgnoreCase("Truck")){
                hrsrate = 5;
                cap = 60;
            }
            else if (type.equalsIgnoreCase("Bus")){
                hrsrate = 7;
                cap = 100; 
            }

            double parkingfee = hrs * hrsrate;
            double finalfee = Math.min(parkingfee,cap);
            total += finalfee;

            if (hrs > 8)
                peak++;

            System.out.println("Vehicle " + (i+1) + ": " + type);
            System.out.printf("Hours Parked: %.1f\n" , hrs);
            System.out.printf("Hourly Rate: $%.1f\n", hrsrate);
            System.out.printf("Parking Fee: $%.1f\n" , finalfee);
            System.out.printf("Cap Applied: %s\n\n",(cap != 0)? "Yes" : "No");
        }

        double avg = total / n;

        System.out.println("Total Vehicles: " + n); 
        System.out.printf("Total Revenue: $%.1f\n" , total);
        System.out.printf("Average Fee: $%.1f\n" , avg);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peak);
        
        sc.close();
    }
}
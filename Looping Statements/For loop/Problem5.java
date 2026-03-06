import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0,peak = 0,full = 0;
        double max = 0;

        for (int i=0; i<n; i++){
            int day = sc.nextInt();
            int roomsocc = sc.nextInt();
            int totalroom = sc.nextInt();

            double occupancyrte = (roomsocc * 100) / totalroom;
            sum += occupancyrte;

            String sts = "";
            if (occupancyrte < 60)
                sts = "Low";
            else if (occupancyrte >= 60 && occupancyrte < 80)
                sts = "Moderate";
            else if (occupancyrte >= 80 && occupancyrte < 100)
                sts = "High";
            else if (occupancyrte == 100){
                sts = "Full";
                full++;
            }

            if (max < occupancyrte){
                max = occupancyrte;
                peak = day;
            }
            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsocc);
            System.out.println("Total Rooms: " + totalroom);
            System.out.println("Occupancy Rate: " + occupancyrte + "%");
            System.out.println("Status: " + sts + '\n');
        }
        double avg = sum / n; 
        System.out.println("Total Days Analyzed: " + n);
        System.out.println("Average Occulpancy Rate: " + avg + "%");
        System.out.println("Peak Occupancy Day: Day " + peak);
        System.out.println("Days at Full Capacity: " + full);

        sc.close();
    }
}
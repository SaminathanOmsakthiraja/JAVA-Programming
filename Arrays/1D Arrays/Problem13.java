import java.util.*;

public class Problem13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = arr[0];
        int onTime = 0;
        int compensation = 0;

        for(int i = 0; i < n; i++){

            sum = sum + arr[i];

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] <= 15){
                onTime++;
            }

            if(arr[i] > 180){
                compensation++;
            }
        }

        double avg = (double)sum / n;
        double performance = ((double)onTime / n) * 100;

        System.out.println("Total Flights: " + n);
        System.out.printf("Average Delay: %.2f minutes\n", avg);
        System.out.println("Maximum Delay: " + max + " minutes");
        System.out.println("On-Time Flights: " + onTime);
        System.out.println("Compensation Required: " + compensation);
        System.out.printf("On-Time Performance: %.2f%%\n", performance);

        sc.close();
    }
}
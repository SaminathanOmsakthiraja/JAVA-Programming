import java.util.*;

public class Problem15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        int exceed = 0;

        for(int i = 0; i < n; i++){

            sum = sum + arr[i];

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] > 300){
                exceed++;
            }
        }

        double avg = (double)sum / n;
        double compliance = ((double)(n - exceed) / n) * 100;

        System.out.println("Total Calls: " + n);
        System.out.printf("Average Handling Time: %.2f seconds\n", avg);
        System.out.println("Shortest Call: " + min + " seconds");
        System.out.println("Longest Call: " + max + " seconds");
        System.out.println("Calls Exceeding Target (300s): " + exceed);
        System.out.printf("Target Compliance: %.2f%%\n", compliance);

        sc.close();
    }
}
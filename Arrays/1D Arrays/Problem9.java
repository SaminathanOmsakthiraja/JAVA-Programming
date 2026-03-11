import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double total = 0;

        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();

            if(arr[i] > max){
                max = arr[i];
                maxIndex = i + 1;
            }

            if(arr[i] < min){
                min = arr[i];
                minIndex = i + 1;
            }

            total += arr[i];
        }

        double avg = total / n;

        System.out.println("Total Stores: " + n);
        System.out.printf("Highest Sales: $%.2f (Store %d)\n", max, maxIndex);
        System.out.printf("Lowest Sales: $%.2f (Store %d)\n", min, minIndex);
        System.out.printf("Total Sales: $%.2f\n", total);
        System.out.printf("Average Sales: $%.2f", avg);

        sc.close();
    }
}
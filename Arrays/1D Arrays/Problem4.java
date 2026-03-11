import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }

            sum += arr[i];
        }

        double range = max - min;
        double avg = sum / n;

        System.out.println("Number of Readings: " + n);
        System.out.printf("Maximum Temperature: %.2f°C\n", max);
        System.out.printf("Minimum Temperature: %.2f°C\n", min);
        System.out.printf("Temperature Range: %.2f°C\n", range);
        System.out.printf("Average Temperature: %.2f°C\n", avg);

        sc.close();
    }
}
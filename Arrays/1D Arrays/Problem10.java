import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int slow = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }

            sum += arr[i];

            if(arr[i] > 200){
                slow++;
            }
        }

        double avg = (double) sum / n;
        double performance = ((double)(n - slow) / n) * 100;

        System.out.println("Total Servers: " + n);
        System.out.println("Fastest Response: " + min + "ms");
        System.out.println("Slowest Response: " + max + "ms");
        System.out.printf("Average Response: %.2fms\n", avg);
        System.out.println("Slow Servers (>200ms): " + slow);
        System.out.printf("Performance Score: %.2f%%", performance);

        sc.close();
    }
}
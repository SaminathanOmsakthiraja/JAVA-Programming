import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        double sum = 0;
        int unsafe = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double avg = sum / n;

        String str = "[";

        for(int i = 0; i < n; i++){

            if(arr[i] < 6.5 || arr[i] > 8.5){
                unsafe++;
                str += (i+1) + ", ";
            }

        }

        if(unsafe > 0){
            str = str.substring(0, str.length()-2);
        }

        str += "]";

        double safeRate = ((double)(n-unsafe) / n) * 100;

        System.out.println("Monitoring Points: " + n);
        System.out.println("Average pH Level: " + String.format("%.2f", avg));
        System.out.println("Unsafe Readings: " + unsafe);
        System.out.println("Critical Locations: " + str);
        System.out.println("Water Quality Score: " + String.format("%.2f", safeRate) + "%");

        sc.close();
    }
}
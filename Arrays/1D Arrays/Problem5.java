import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        double diff = max - min;
        double savings = (diff / max) * 100;

        System.out.println("Number of Sellers: " + n);
        System.out.printf("Lowest Price: $%.2f\n", min);
        System.out.printf("Highest Price: $%.2f\n", max);
        System.out.printf("Price Difference: $%.2f\n", diff);
        System.out.printf("Savings: %.2f%%", savings);

        sc.close();
    }
}
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        double sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double avg = sum / n;
        double threshold = avg * 2;

        int count = 0;
        StringBuilder str = new StringBuilder("[");

        for(int i = 0; i < n; i++){
            if(arr[i] > threshold){
                count++;
                str.append(i);
                str.append(", ");
            }
        }

        if(count > 0){
            str.delete(str.length() - 2, str.length());
        }

        str.append("]");

        System.out.println("Total Transactions: " + n);
        System.out.printf("Average Transaction: $%.2f\n", avg);
        System.out.println("Suspicious Transactions: " + count);
        System.out.println("Fraud Alert Indices: " + str.toString());

        sc.close();
    }
}
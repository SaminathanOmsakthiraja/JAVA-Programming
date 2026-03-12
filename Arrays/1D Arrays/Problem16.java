import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        int sum = 0;
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }

            sum += arr[i];
        }

        int avg = sum / n;
        double threshold = avg * 1.5;

        int count = 0;
        StringBuilder str = new StringBuilder("[");

        for (int i = 0; i < n; i++) {
            if (arr[i] > threshold) {
                count++;
                str.append(i + 1);
                str.append(", ");
            }
        }

        if (count > 0) {
            str.delete(str.length() - 2, str.length());
        }

        str.append("]");

        System.out.println("Trading Days Analyzed: " + n);
        System.out.println("Total Volume: " + sum);
        System.out.println("Average Daily Volume: " + avg);
        System.out.println("Peak Volume Day: Day " + (idx + 1) + " (" + max + ")");
        System.out.println("High Volume Days (>150% avg): " + count);
        System.out.println("Breakout Signal Days: " + str.toString());

        sc.close();
    }
}
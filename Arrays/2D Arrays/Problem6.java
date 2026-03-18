import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lane = sc.nextInt();
        int hrs = sc.nextInt();

        int[][] arr = new int[lane][hrs];
        for (int i = 0; i < lane; i++) {
            for (int j = 0; j < hrs; j++) {
                arr[i][j] = sc.nextInt();                
            }
        }
        System.out.println("Traffic Data:");
        for (int i = 0; i < lane; i++) {
            for (int j = 0; j < hrs; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTotal Traffic Per Lane:");
        for (int i = 0; i < lane; i++) {
            int sum = 0;
            for (int j = 0; j < hrs; j++) {
                sum += arr[i][j];
            }
            System.out.println("Lane " + (i + 1) + ": " + sum);
        }

        int max = 0;
        int busiestHour = 0;

        for (int j = 0; j < hrs; j++) {
            int sum = 0;
            for (int i = 0; i < lane; i++) {
                sum += arr[i][j];
            }

            if (sum > max) {
                max = sum;
                busiestHour = j + 1;
            }
        }

        System.out.println("\nBusiest Hour: Hour " + busiestHour + " with " + max + " vehicles");

        sc.close();
    }
    
}

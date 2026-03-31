import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[][] comp = new int[n/2][n/2];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Image:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n/2; i++){
            for (int j = 0; j < n/2; j++){
                int sum = arr[2*i][2*j] 
                        + arr[2*i][2*j+1] 
                        + arr[2*i+1][2*j] 
                        + arr[2*i+1][2*j+1];

                comp[i][j] = sum / 4;
            }
        }

        System.out.println("\nCompressed Image:");
        for (int i = 0; i < n/2; i++){
            for (int j = 0; j < n/2; j++){
                System.out.printf("%d ", comp[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
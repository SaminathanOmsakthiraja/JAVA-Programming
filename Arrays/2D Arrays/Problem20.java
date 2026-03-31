import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        boolean sym = true;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i][j] != arr[j][i]){
                    sym = false;
                    break;
                }
            }
        }

        if (sym){
            System.out.println("\nStatus: Symmetric");
        } else {
            System.out.println("\nStatus: Asymmetric");
        }

        sc.close();
    }
}
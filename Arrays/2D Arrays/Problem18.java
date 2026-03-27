import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][];
        int max = Integer.MIN_VALUE;
        int pos = 0;

        for (int i = 0; i < n; i++){
            int col = sc.nextInt() + 1;
            arr[i] = new int[col];

            arr[i][0] = 0;

            for (int j = 1; j < col; j++){
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1){
                    arr[i][0]++;
                }
            }

            if (max < arr[i][0]){
                max = arr[i][0];
                pos = i + 1;
            }
        }

        System.out.println("Hotel Status:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Floor %d: ", i + 1);
            for (int j = 1; j < arr[i].length; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nOccupancy Report:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Floor %d: %d occupied\n", i + 1, arr[i][0]);
        }

        System.out.printf("\nBusiest Floor: Floor %d (%d rooms occupied)", pos, max);

        sc.close();
    }
}
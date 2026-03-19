import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] ele = new int[row][col];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ele[i][j] = sc.nextInt();
                if (max < ele[i][j])
                    max = ele[i][j];
                if (min > ele[i][j])
                    min = ele[i][j];
            }
        }
        System.out.println("Elevation Map: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ",ele[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nHighest Point: " + max + " m");
        System.out.println("Lowest Point: " + min + " m");
        System.out.println("Elevation Range: " + (max - min) + " m");

        sc.close();
    }
    
}

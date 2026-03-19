import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat = new int[row][col];
        int[] rep = new int[row];
        int[] ter = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
                rep[i] += mat[i][j];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ter[i] += mat[j][i];
            }
        }
        System.out.println("Sales Matrix:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ",mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nRepresentative Totals:");
        for (int i = 0; i < row; i++){
            System.out.println("Rep " + (i+1) + ": " + rep[i]);
        }

        System.out.println("\nTerritory Totals:");
        for (int i = 0; i < col; i++){
            System.out.println("Territory " + (i+1) + ": " + ter[i]);
        }

        sc.close();
    }
    
}

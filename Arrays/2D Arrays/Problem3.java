import java.util.Scanner;

public class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat1 = new int[row][col];
        int[][] sum = new int[row][col];
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                mat1[i][j] = sc.nextInt();
                sum[i][j] = mat1[i][j];
            }
        }

        int[][] mat2 = new int[row][col];
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                mat2[i][j] = sc.nextInt();
                sum[i][j] += mat2[i][j];
            }
        }

        System.out.println("\nMatrix 1:");
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++)
                System.out.printf("%d ",mat1[i][j]);
            System.out.println();
        }
        System.out.println("\nMatrix 2: ");
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++)
                System.out.printf("%d ",mat2[i][j]);
            System.out.println();
        }
        System.out.println("\nSum Matrix: ");
        for ( int i=0; i<row ; i++) {
            for (int j=0; j<col; j++) 
                System.out.printf("%d ",sum[i][j]);
            System.out.println();
        }

        sc.close();
    }
}
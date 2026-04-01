import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int[][] mat1 = new int[row1][col1];
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        int[][] mat2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix A: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.printf("%d ",mat1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatrix B: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("%d ",mat2[i][j]);
            }
            System.out.println();
        }

        if (col1 == row2){
            int[][] mul = new int[row1][col2];
            for (int i = 0; i < row1; i++){
                for (int j = 0; j < col2; j++){
                    for (int k = 0; k < col1; k++) {
                        mul[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("\nResult Matrix: ");
            for (int i = 0; i < mul.length; i++){
                for (int j = 0; j < mul[i].length; j++) {
                    System.out.printf("%d ",mul[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
    
}

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int brt = sc.nextInt();

        int[][] img = new int[row][col];
        int[][] adj_img = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                img[i][j] = sc.nextInt();
                adj_img[i][j] = brt + img[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (adj_img[i][j] >= 255)
                    adj_img[i][j] = 255;
            }
        }
        System.out.println("Original Image:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ",img[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nAdjusted Image:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ",adj_img[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
    
}

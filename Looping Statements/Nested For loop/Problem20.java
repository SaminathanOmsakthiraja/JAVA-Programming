import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        int[][] tra = new int[col][row];

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                mat[i][j] = sc.nextInt();
                tra[j][i] = mat[i][j];
            }
        }
        System.out.printf("Original Matrix (%d X %d):\n",row,col);
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.printf("%d ",mat[i][j]);
            }
            System.out.println();
        }
        
        System.out.printf("Transposed Matrix (%d X %d): \n",col,row);
        for (int i=0 ; i<col ; i++){
            for (int j=0 ; j<row ; j++)
                System.out.printf("%d ",tra[i][j]);
            System.out.println();
        }


        sc.close();
    }
    
}

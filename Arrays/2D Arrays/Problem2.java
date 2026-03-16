import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int book = sc.nextInt();
        char [][] arr = new char[row][col];
        for(int i = 0; i < row; i++){
            Arrays.fill(arr[i], 'A');
        }
        for (int i=0 ; i<book ; i++){
                int n = sc.nextInt();
                int m = sc.nextInt();
                arr[n][m] = 'B';
        }
        System.out.println("Seating Chart: ");
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.printf("%c ",arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

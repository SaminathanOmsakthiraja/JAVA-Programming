import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() + 2;
        int[][] arr = new int[n][n];

        arr[0][0]=1;
        arr[1][0]=1;arr[1][0]=1;

        System.out.println("Pascal's Triangle:");
        
        for (int i=2 ; i<n ; i++){
            for (int j=1 ; j<i ; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
    
}

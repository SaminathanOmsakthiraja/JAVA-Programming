import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("\nMatrix A: ");
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMatrix B: ");
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                int a =sc.nextInt();
                arr[i][j] += a;
                System.out.printf("%d ",a);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum (A + B): ");
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
 
        sc.close();
    }
    
}

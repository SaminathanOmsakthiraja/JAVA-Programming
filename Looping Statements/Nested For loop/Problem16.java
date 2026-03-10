import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean [][] arr = new boolean[n][m];
        int a = sc.nextInt();

        for (int i=0 ; i<a ; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr[b][c] = true;
        }
        System.out.println("Parking Lot Grid: ");
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                if(arr[i][j])
                    System.out.printf("[O]");
                else
                    System.out.printf("[]");
            }
            System.out.println();
        }
        int total = n * m;
        double rate =  (double) a / total * 100; 
        System.out.println("Total Spots: " + total);
        System.out.println("Occupied: " + a);
        System.out.println("Vacant: " + (total-a));
        System.out.printf("Occupancy Rate: %.2f%%" , rate);

        sc.close();
    }
    
}

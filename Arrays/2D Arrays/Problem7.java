import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nInventory Grid: ");
        int max = Integer.MIN_VALUE;
        int r = 0, c = 0;
        double sum = 0;
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.printf("%d ",arr[i][j]);
                if (max < arr[i][j]){
                    max = arr[i][j];
                    r = i;
                    c = j;
                }
                sum += arr[i][j];
            }
            System.out.println();
        }
        double total = row * col;
        int avg = (int)((sum / total)*100);
        System.out.println("\nTotal Inventory: " + sum);
        System.out.printf("Max Stock Zone: Row %d, Col %d (%d units)\n",r,c,max);
        System.out.println("Average Stock per Zone: " + avg);

        sc.close();
    }
    
}

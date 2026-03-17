import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] pro = new int[row][col];
        int max = Integer.MIN_VALUE;
        int [] eachsum = new int[row];
        int product = 0;

        for (int i=0 ; i<row ; i++){
            int sum = 0;
            for (int j=0 ; j<col ; j++){
                pro[i][j] = sc.nextInt();
                sum += pro[i][j];
            }
            if (max < sum){
                max = sum;
                product = i+1;
            }
            eachsum[i] = sum;
        }

        System.out.println("Sales Data:");
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) 
                System.out.printf("%d ",pro[i][j]);
            System.out.println();
        }
        System.out.println("\nProduct-wise Total Sales: ");
        for (int i = 0; i < row ; i++) {
            System.out.println("Product " + (i+1) + " : " + eachsum[i]);
        }
        System.out.println("\n Best-Selling Product: Product " + product + " with " + max + " units");
        

        sc.close();
    }
    
}

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] temp = new int[row][col];

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double sum = 0;
        
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                temp[i][j] = sc.nextInt();
                if (max < temp[i][j])
                    max = temp[i][j];
                if (min > temp[i][j])
                    min = temp[i][j];
                sum += temp[i][j];
            }
        }
        System.out.println("\nTemperature Grid: \n");
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.printf("%d ",temp[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if (max == temp[i][j])
                    System.out.printf("Maximum Temperature: %d°C at position (%d, %d)\n",max , i, j);
                if (min == temp[i][j])
                    System.out.printf("Maximum Temperature: %d°C at position (%d, %d)\n",min , i, j);
            }
        }
        double total = (double)row*col;
        double avg = (sum/total)*100.0;
        System.out.printf("Average Temperature: %d°C", (int)avg);

        sc.close();
    }
    
}

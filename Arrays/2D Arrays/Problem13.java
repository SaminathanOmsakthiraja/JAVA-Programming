import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        int occupied = 0;
        int total = rows * cols;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1){
                    occupied++;
                }
            }
        }

        System.out.println("Seating Map:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        int rate = (occupied * 10000) / total;

        System.out.printf("\nTotal Occupied: %d\n", occupied);
        System.out.printf("Occupancy Rate: %d%%\n", rate);

        System.out.print("Empty Rows: [");
        boolean first = true;

        for (int i = 0; i < rows; i++){
            boolean empty = true;

            for (int j = 0; j < cols; j++){
                if (arr[i][j] == 1){
                    empty = false;
                    break;
                }
            }

            if (empty){
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }

        System.out.println("]");

        sc.close();
    }
}
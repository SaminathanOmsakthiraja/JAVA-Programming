import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][7];
        int[] sum = new int[4];
        int total = 0;
        int min = Integer.MAX_VALUE;
        int pos = 0;

        for (int i = 0; i < 4; i++){
            int s = 0;
            for (int j = 0; j < 7; j++){
                arr[i][j] = sc.nextInt() * 10;
                s += arr[i][j];
            }
            sum[i] = s;
            total += s;
            if (s < min){
                min = s;
                pos = i+1;
            }
        }
        System.out.println("Rainfall Data:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nWeekly Totals:");
        for (int i = 0; i < 4; i++){
            System.out.printf("Week %d: %d mm\n",(i+1),sum[i]);
        }
        System.out.printf("\nMonthly Total: %d mm\n",total);
        System.out.printf("Driest Week: Week %d (%d mm)",pos,min);

        sc.close();
    }
    
}

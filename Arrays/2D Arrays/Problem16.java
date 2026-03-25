import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] map = new int[10][10];
        boolean[] usedRow = new boolean[10];
        int[] maxCol = new int[10];

        int T = sc.nextInt();

        for (int i = 0; i < 10; i++){
            maxCol[i] = -1;
        }

        for (int i = 0; i < T; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            map[r][c] = 1;
            usedRow[r] = true;

            if (c > maxCol[r]){
                maxCol[r] = c;
            }
        }

        System.out.println("Treasure Map: ");
        for (int i = 0; i < 10; i++){
            if (usedRow[i]){
                for (int j = 0; j <= maxCol[i]; j++){
                    System.out.print(map[i][j] + " ");
                }
                System.out.println("\n");
            }
        }

        int C = sc.nextInt();

        for (int i = 0; i < C; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (map[r][c] == 1){
                System.out.printf("Checking Location (%d, %d): Treasure Found!\n", r, c);
                map[r][c] = 0;
            } else {
                System.out.printf("Checking Location (%d, %d): No Treasure\n", r, c);
            }
        }

        System.out.println("\nFinal Map:");
        for (int i = 0; i < 10; i++){
            if (usedRow[i]){
                if (maxCol[i] == -1){
                    System.out.println("0\n");
                } else {
                    for (int j = 0; j <= maxCol[i]; j++){
                        System.out.print(map[i][j] + " ");
                    }
                    System.out.println("\n");
                }
            }
        }
        sc.close();
    }
}
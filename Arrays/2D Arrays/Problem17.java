import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        boolean valid = true;

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sudoku Grid:");
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 9; i++){
            boolean[] seen = new boolean[10];

            for (int j = 0; j < 9; j++){
                int val = arr[i][j];

                if (val < 1 || val > 9 || seen[val]){
                    valid = false;
                    break;
                }
                seen[val] = true;
            }

            if (!valid) break;
        }

        for (int j = 0; j < 9 && valid; j++){
            boolean[] seen = new boolean[10];

            for (int i = 0; i < 9; i++){
                int val = arr[i][j];

                if (val < 1 || val > 9 || seen[val]){
                    valid = false;
                    break;
                }
                seen[val] = true;
            }
        }

        if (valid){
            System.out.println("\nStatus: Valid Solution");
        } else {
            System.out.println("\nStatus: Invalid Solution");
        }

        sc.close();
    }
}
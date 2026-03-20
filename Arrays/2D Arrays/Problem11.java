import java.util.Scanner;

public class Problem11 {
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
        System.out.println("Seating Layout:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        int count = 0;
        boolean found = false;

        System.out.println();
        System.out.println("Violations Found: ");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == 1){
                    for(int di = -1; di <= 1; di++){
                        for(int dj = -1; dj <= 1; dj++){

                            if(di == 0 && dj == 0) continue;

                            int ni = i + di;
                            int nj = j + dj;
                            if(ni >= 0 && ni < row && nj >= 0 && nj < col){
                                if(arr[ni][nj] == 1){
                                    if(i < ni || (i == ni && j < nj)){
                                        System.out.println("- Seat at (" + i + ", " + j + ") is too close to (" + ni + ", " + nj + ")");
                                        count++;
                                        found = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(!found){
            System.out.println();
        }

        System.out.println("Status: " + (count == 0 ? "Compliant" : "Non-Compliant"));


        sc.close();
    }
    
}

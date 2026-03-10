import java.util.*;
public class Problem13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for(int j = left; j <= right; j++){
                arr[top][j] = num++;
            }
            top++;

            for(int j = top; j <= bottom; j++){
                arr[j][right] = num++;
            }
            right--;

            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    arr[bottom][j] = num++;
                }
                bottom--;
            }

            if(left <= right){
                for(int j = bottom; j >= top; j--){
                    arr[j][left] = num++;
                }
                left++;
            }

            if(num > n*n){
                break;
            }
        }

        System.out.println("Spiral Matrix:");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int fail = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] < 40){
                fail++;
            }
        }

        int pass = n - fail;
        double percent = ((double) pass / n) * 100;

        System.out.println("Total Students: " + n);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        System.out.println("Failed Students: " + fail);
        System.out.printf("Pass Percentage: %.2f%%", percent);

        sc.close();
    }
}
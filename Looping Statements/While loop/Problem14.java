import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dp1 = n,dp2 = n;
        int count = 0;
        while (dp1 != 0) {
            count++;
            dp1 /= 10;
        }
        int sum = 0;
        while (dp2 != 0) {
            sum += Math.pow(dp2 % 10,count);
            dp2 /= 10;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");

        sc.close();
    }   
}
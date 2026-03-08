import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), dp1 = n;
        int m = sc.nextInt(), dp2 = m;

        int sum = 0;
        while (n <= m) {
            if (n % 2 == 0)
                sum += n;
            n++;
        }

        System.out.println("Sum of even numbers from " + dp1 + " to " + dp2 + " : " + sum);

        sc.close();
    }   
}
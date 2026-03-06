import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dp = n, fact = 1;
        while (dp!=1) {
            fact *= dp;
            dp--;
        }
        System.out.printf("Factorial of %d = %d",n ,fact);

        sc.close();
    }
    
}

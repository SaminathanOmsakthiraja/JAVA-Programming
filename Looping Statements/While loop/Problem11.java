import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),dp1 = a;
        int b = sc.nextInt(),dp2 = b;

        while (b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD of " + dp1 + " and " + dp2 + " = " + a);

        sc.close();
    }
    
}

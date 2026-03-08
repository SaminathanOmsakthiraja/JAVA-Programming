import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), dp1 = a;
        int b = sc.nextInt(), dp2 = b;

        while (a!=b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        System.out.println("HCF of " + dp1 + " and " + dp2 + " = " + b);

        sc.close();
    }
    
}

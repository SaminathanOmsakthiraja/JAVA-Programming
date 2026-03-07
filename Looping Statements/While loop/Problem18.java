import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),dp1 = a;
        int b = sc.nextInt(),dp2 = b;
        int pro = a * b;

        while (a!=b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        int lcm = pro / a;
        System.out.println("LCM of " + dp1 + " and " + dp2 + " = " + lcm);

        sc.close();
    }
    
}

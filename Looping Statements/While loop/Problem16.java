import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dp = n;
        int dec = 0;
        int i = 0;
        while (n != 0) {
            if (n%10 != 0)
                dec += Math.pow(2, i);
            n /= 10;
            i++;
        }
        System.out.println("Binary: " + dp);
        System.out.println("Decimal: " + dec);

        sc.close();
    }
    
}
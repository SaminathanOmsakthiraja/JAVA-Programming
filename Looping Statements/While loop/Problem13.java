import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exp = sc.nextInt(), dp = exp;
        int power = 1;
        while (exp != 0) {
            power *= base;
            exp--;
        }

        System.out.println(base + "^" + dp + " = " + power);

        sc.close();
    }
    
}

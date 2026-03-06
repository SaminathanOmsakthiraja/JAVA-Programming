import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = 2;
        while (d != n) {
            if (n%d==0 && d!=n){
                System.out.println(n + " is not prime");
                break;
            }
            d++;
        }
        if (d == n)
        System.out.println(n + " is prime");

        sc.close();
    }
    
}

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1, sum = 0;

        while (i != n-1) {
            if (n % i == 0)
                sum += i;
            i++;
        }
        if (n == sum)
            System.out.println(n + " is a Perfect number");
        else
            System.out.println(n + " is not a Perfect number");

        sc.close();
    }   
}
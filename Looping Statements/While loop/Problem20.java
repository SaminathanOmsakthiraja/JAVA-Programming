import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(), n = num;
        int sum = 0;

        while (num != 0) {

            int rem = num % 10;
            int fact = 1;

            int i = 1;
            while (i <= rem) {
                fact *= i;
                i++;
            }

            sum += fact;
            num /= 10;
        }

        if (sum == n)
            System.out.println(n + " is a strong number");
        else
            System.out.println(n + " is not a strong number");

        sc.close();
    }
}
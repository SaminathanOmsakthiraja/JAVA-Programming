import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),du = n;
        int rev = 0;
        while (du != 0) {
            rev += du % 10;
            du /= 10;
            rev *= 10;
        }
        rev /= 10;
        if (n == rev)
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");

        sc.close();
    }   
}
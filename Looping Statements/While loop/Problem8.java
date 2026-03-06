import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();
        int dp = digit;
        int sum = 0;
        do{
            sum += digit%10;
            digit /= 10;
        }while(digit!=0);

        System.out.println("Number: " + dp);
        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}

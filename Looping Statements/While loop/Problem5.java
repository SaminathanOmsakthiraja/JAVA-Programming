import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ori = sc.nextInt();
        int dp = ori;
        int rev = 0;
        while (dp!=0) {
            rev += dp%10;
            dp/=10;
            rev*=10;          
        }
        rev/=10;
        System.out.printf("Original: %d",ori);
        System.out.printf("Reversed: %d",rev);

        sc.close();
    }
    
}

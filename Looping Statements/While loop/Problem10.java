import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() - 2;
        int a = 0;
        int b = 1;
        System.out.printf("%d %d ",a ,b);
        while (n!=0) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.printf("%d ",b);
            n--;            
        }


        sc.close();
    }
    
}

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;

        while (i != m) {
            i++;
            System.out.printf("%d x %d = %d\n", n , i , n*i);
        }

        sc.close();
    }
    
}

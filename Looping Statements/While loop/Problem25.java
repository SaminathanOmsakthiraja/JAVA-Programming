import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = i;
            while (j != 0) {
                System.out.printf("%d ",i);
                j--;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
    
}

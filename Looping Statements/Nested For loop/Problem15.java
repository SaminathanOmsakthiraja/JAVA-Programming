import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Star Rating Matrix:\r\n" + "Product Rating Stars\r\n");

        for (int i=0 ; i<n ; i++){
            String str = sc.next();
            double rate = sc.nextDouble();
            System.out.printf("%s %.1f ",str,rate);
            int count = 0;
            for (int j=0 ; j<(int)rate ; j++){
                System.out.printf("*");
                count++;
            }
            for (int j=0 ; j<(5-count) ; j++)
                System.out.printf("^");
            System.out.println();
        }

        sc.close();
    }
    
}

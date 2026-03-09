import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        for (i=1 ; i<=n/2+1 ; i++){
            for (int j=1 ; j<=i*2-1 ; j++)
                System.out.printf("*");
            System.out.println();
        }
        for (int j=i-2 ; j>0 ; j--){
            for (int k=1 ; k<=j*2-1 ; k++)
                System.out.printf("*");
            System.out.println();
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1 ; i<=n ; i++){
            int j=1;
            for (j=1 ; j<=i ; j++){
                System.out.printf("%d",j);
            }
            for (j=j-2 ; j>0 ; j--){
                System.out.printf("%d",j);
            }
            System.out.println();
        }

        sc.close();
    }
    
}

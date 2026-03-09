import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Chess Board Pattern: ");
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n ; j++){
                if ((i+j) % 2 == 0)
                    System.out.printf("■ ");
                else
                    System.out.printf("□ ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Hollow Rectangle Pattern: ");
        for (int i=1 ; i<=row ;i++){
            for (int j=1 ; j<=col ; j++){
                if (i==1 || i==row || j==1 || j==col)
                    System.out.printf("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}

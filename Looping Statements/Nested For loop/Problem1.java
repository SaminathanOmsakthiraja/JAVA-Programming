import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        for (int i=1; i<=column; i++){
            System.out.printf("%d ",i);
        }
        System.out.println();

        for (int i = 1; i <= row; i++){
            System.out.printf("%d ",i);
            for (int j = 1; j <= column; j++){
                System.out.printf("%d ",i*j);
            }
            System.out.println();
        }

        sc.close();
    }
}
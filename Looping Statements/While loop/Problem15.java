import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int steps = 0;

        do{
            if (n == 1)
                break;
            System.out.printf("%d ",n);
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            steps++;
        }while(n != 1);
        System.out.println(1);
        System.out.println("Steps: " + steps);

        sc.close();
    }   
}
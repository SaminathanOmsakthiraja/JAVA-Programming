import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 1, sum = 0, count = 0;
        while (n!=0) {
            System.out.println("Enter number (0 to stop): ");
            n = sc.nextInt();
            sum += n;
            count++;
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Count: " + (count-1));

        sc.close();
    }    
}

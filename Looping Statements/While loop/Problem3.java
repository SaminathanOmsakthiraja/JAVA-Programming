import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int sec = sc.nextInt();
        int guess = sec+1, attempt = 0;
        while (guess != sec){
            System.out.println("Guess the number (1100): ");
            guess = sc.nextInt();
            if (guess < sec)
                System.out.println("Too low!");
            else
                System.out.println("Too high!");
            attempt ++;
        }
        System.out.println("Correct! Attempts: " + attempt);

        sc.close();
    }
}
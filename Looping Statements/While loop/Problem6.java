import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = 0;

        System.out.println("Balance: " + balance);
        boolean done = false;

        while (!done) {
            System.out.println("Enter withdrawal amount: ");
            withdraw = sc.nextInt();
            
            if (withdraw < balance){
                balance -= withdraw;
                done = true;
                System.out.println("Withdrawal Successul! Remaining balance: " + balance);
            }
            else {
                System.out.println("Insufficient funds! Try again.");
            }
        }

        sc.close();
    }
    
}

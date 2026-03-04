import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double intibal = sc.nextDouble();
        double currbal = intibal;
        int n = sc.nextInt();
        int fail = 0,succ = 0,sum = 0;

        for (int i=0; i<n; i++){
            double withdraw = sc.nextDouble();
            String sts = "";
            sts = (withdraw <= currbal)? "Approve" : "Denied";
            System.out.println("Transaction " + (i+1) + ": $" + withdraw);
            System.out.println("Status: " + sts);
            if (sts.equals("Approve")){
                currbal -= withdraw;
                succ++;
            }
            else if (sts.equals("Denied")){
                System.out.println("Insufficient funds");
                fail++;
            }
            System.out.println("Remaining Balance: $" + currbal + '\n');
            sum += withdraw;
        }
        System.out.println("Total Transactions: " + n);
        System.out.println("Successful Withdrawals: " + succ);
        System.out.println("Failed Withdrawals: " + fail);
        System.out.println("Final Balance: $" + currbal);
        System.out.println("Total Withdrawn: $" + sum);
    }
}

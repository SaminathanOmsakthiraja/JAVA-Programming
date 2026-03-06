import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double dep = 0, wit = 0, trans = 0, pay = 0;

        for(int i=0;i<n;i++){

            String type = sc.next();
            double amt = sc.nextDouble();

            String cat = "";

            if(type.equalsIgnoreCase("Deposit")){
                cat = "Credit";
                dep += amt;
            }
            else if(type.equalsIgnoreCase("Withdrawal")){
                cat = "Debit";
                wit += amt;
            }
            else if(type.equalsIgnoreCase("Transfer")){
                cat = "Debit";
                trans += amt;
            }
            else if(type.equalsIgnoreCase("Payment")){
                cat = "Debit";
                pay += amt;
            }

            System.out.println("Transaction " + (i+1) + ": " + type);
            System.out.println("Amount: $" + amt);
            System.out.println("Category: " + cat);
            System.out.println();
        }

        double net = dep - (wit + trans + pay);

        System.out.println("Total Transactions: " + n);
        System.out.println("Total Deposits: $" + dep);
        System.out.println("Total Withdrawals: $" + wit);
        System.out.println("Total Transfers: $" + trans);
        System.out.println("Total Payments: $" + pay);
        System.out.println("Net Balance Change: $" + net);

        sc.close();
    }
}
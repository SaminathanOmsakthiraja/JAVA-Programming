import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int creditscore = sc.nextInt();
        double annualincome = sc.nextInt();
        double debttoincome = sc.nextInt();
        String loantype = sc.next();
        int status = 0;
        int crdrng = 0,debrng = 0;
        double Max = 0;
        if (creditscore < 600 || debttoincome > 50){
            status=0;
        }
        if (creditscore >= 750)
            crdrng = 3;
        else if (creditscore >= 700 && creditscore < 750)
            crdrng = 2;
        else if (creditscore >= 650 && creditscore < 700)
            crdrng = 1;
        else
            crdrng = 0;
        if (debttoincome <= 30)
            debrng = 1;
        else if (debttoincome > 30 && debttoincome <= 40)
            debrng = 2;
        else if (debttoincome > 40)
            debrng = 3;
        
        if (loantype.equals("Home")){
            if (crdrng == 3 && debrng == 1){
                status = 1;
                Max = (4 * annualincome);
            }
            else if (crdrng == 2 && debrng == 2){
                status = 2;
                Max = (3 * annualincome);
            }
        }
        else if (loantype.equals("Personal")){
            if (crdrng == 3 && debrng == 1){
                status = 1;
                Max = (1 * annualincome);
            }
            else if (crdrng == 0 && debrng == 2){
                status = 2;
                Max = (0.5 * annualincome);
            }
        }
        else if (loantype.equals("Business")){
            if ((crdrng == 3 || crdrng == 2) && (debrng == 1 || debrng == 2)){
                status = 1;
                Max = (3 * annualincome);
            }
        }
        System.out.println();
        System.out.println("Credit Score: " + creditscore);
        System.out.println("Annual Income: $" + annualincome);
        System.out.println("Debt-to-Income Ratio: " + debttoincome + "%");
        System.out.println("Loan Type: " + loantype);    
        if ( status == 1)
            System.out.println("Decision: Approved");
        else if (status == 2)
            System.out.println("Decision: Needs Review");
        System.out.println("Maximum Loan Amount: $" + Max);
        sc.close();
    }
}

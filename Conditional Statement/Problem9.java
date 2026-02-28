import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double annualRevenue = sc.nextDouble();
        String businessType = sc.next();
        double deductibleExpenses = sc.nextDouble();
        double taxCredit = sc.nextDouble();

        int taxRate = 0;
        double grossTax = 0, taxableincome = 0, netTax = 0;

        taxableincome = annualRevenue - deductibleExpenses;
        
        if (businessType.equals("C-Crop")){
            if (taxableincome < 500000)
                taxRate = 21;
            else if (taxableincome >= 500000 && taxableincome < 1000000)
                taxRate = 24;
            else if (taxableincome >= 1000000 && taxableincome < 2000000)
                taxRate = 28;
            else if (taxableincome > 2000000)
                taxRate = 30;
        }
        else if (businessType.equals("S-Crop")){
            if (taxableincome < 500000)
                taxRate = 20;
            else if (taxableincome >= 500000 && taxableincome < 1000000)
                taxRate = 25;
            else if (taxableincome > 1000000)
                taxRate = 28;
        }
        else if (businessType.equals("LLC")){
            if (taxableincome < 200000)
                taxRate = 15;
            else if (taxableincome >= 200000 && taxableincome < 500000)
                taxRate = 18;
            else if (taxableincome > 500000)
                taxRate = 22;
        }
        else if (businessType.equals("Partnership")){
            if (taxableincome < 300000)
                taxRate = 18;
            else if (taxableincome >= 300000 && taxableincome < 800000)
                taxRate = 22;
            else if (taxableincome > 800000)
                taxRate = 26;
        }
        
        grossTax = (taxableincome * taxRate) / 100;
        
        netTax = grossTax - taxCredit;
        float effectiveTaxRate = (float)(netTax / annualRevenue) * 100;

        System.out.println("Annual Revenue: $" + annualRevenue);
        System.out.println("Business Type: " + businessType);
        System.out.println("Deductible Expenses: $" + deductibleExpenses);
        System.out.println("Tax Credit: $" + taxCredit);
        System.out.println("Taxable Income: $" + taxableincome);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Gross Tax: $" + grossTax);
        System.out.println("Net Tax After Credits: $" + netTax);
        System.out.printf("Effective Tax Rate: %.2f%%", effectiveTaxRate);

        sc.close();
    }
}

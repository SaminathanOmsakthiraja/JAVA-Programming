import java.util.*;

public class Problem23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stockPercentage = sc.nextInt();
        int investmentYears = sc.nextInt();
        sc.nextLine();
        String riskTolerance = sc.nextLine();
        String marketVolatility = sc.nextLine();

        int bondPercentage = 100 - stockPercentage;
        int riskScore = stockPercentage;

        if (investmentYears <= 5) {
            if (stockPercentage > 50) {
                riskScore += 20;
            }
        } 
        else if (investmentYears <= 10) {
            if (stockPercentage > 60) {
                riskScore += 10;
            }
        } 
        else if (investmentYears <= 20) {
            if (stockPercentage > 80) {
                riskScore += 5;
            }
        }

        if (marketVolatility.equals("Medium")) {
            riskScore += 10;
        } 
        else if (marketVolatility.equals("High")) {
            riskScore += 20;
        }

        if (riskScore > 100) {
            riskScore = 100;
        }

        String riskCategory = "";

        if (riskScore <= 30) {
            riskCategory = "Low";
        } 
        else if (riskScore <= 60) {
            riskCategory = "Moderate";
        } 
        else if (riskScore <= 80) {
            riskCategory = "High";
        } 
        else {
            riskCategory = "Very High";
        }

        String alignmentStatus = "";
        String recommendation = "";
        String rebalancing = "";

        if (riskTolerance.equals("Conservative")) {

            if (riskCategory.equals("Low")) {
                alignmentStatus = "Well Aligned";
            } 
            else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
            } 
            else {
                alignmentStatus = "Misaligned";
            }

        } 
        else if (riskTolerance.equals("Moderate")) {

            if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Well Aligned";
            } 
            else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignmentStatus = "Acceptable";
            } 
            else {
                alignmentStatus = "Misaligned";
            }

        } 
        else if (riskTolerance.equals("Aggressive")) {

            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                alignmentStatus = "Well Aligned";
            } 
            else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
            } 
            else {
                alignmentStatus = "Misaligned";
            }
        }

        if (alignmentStatus.equals("Well Aligned")) {
            recommendation = "Portfolio is appropriately balanced for your profile";
            rebalancing = "No action needed";
        } 
        else if (alignmentStatus.equals("Acceptable")) {

            if (riskTolerance.equals("Aggressive") && riskCategory.equals("Very High")) {
                recommendation = "High risk level acceptable given long horizon and tolerance";
                rebalancing = "Monitor closely, consider slight reduction if volatility persists";
            } 
            else {
                recommendation = "Portfolio is reasonably aligned but could be optimized";
                rebalancing = "Consider minor allocation adjustments";
            }

        } 
        else {
            if (riskTolerance.equals("Conservative")) {
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalancing = "Reduce stocks to 30-40%, increase bonds and cash";
            } 
            else {
                recommendation = "Portfolio is too conservative for your risk tolerance";
                rebalancing = "Increase stocks to 80-90% for better growth potential";
            }
        }

        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondPercentage + "%");
        System.out.println("Investment Horizon: " + investmentYears + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignmentStatus);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + rebalancing);

        sc.close();
    }
}

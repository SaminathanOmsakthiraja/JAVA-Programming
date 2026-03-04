import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        double sale = 0,comm = 0,max = 0;
        String per ="";

        for (int i=0; i<n; i++){
            String repname = sc.next();
            double salesamt = sc.nextDouble();
            int commsionrate = 0;
            if (salesamt > 0 && salesamt <= 40000)
                commsionrate = 5;
            else if (salesamt > 40000 && salesamt <= 80000)
                commsionrate = 8;
            else if (salesamt > 80000 && salesamt <= 100000)
                commsionrate = 10;
            else if (salesamt > 100000 && salesamt <= 150000)
                commsionrate = 12;
            else if (salesamt > 150000)
                commsionrate = 15;

            double commision = (salesamt * commsionrate) / 100;
            double bonus = 0;
            if (salesamt >= 100000)
                bonus = 2000;
            else if (salesamt >= 150000)
                bonus = 3000;
            sale += salesamt;
            comm += commision;
            double payout = commision + bonus;
            if(max < salesamt){
                max = salesamt;
                per = repname;
            }

            System.out.println("Sales Rep: " + repname);
            System.out.println("Sales Amount: $" + salesamt);
            System.out.println("Commision Rate: " + commsionrate + "%");
            System.out.println("Commision Earned: $" + commision);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + payout + '\n');

        }
        System.out.println("Total Sales Reps: " + n);
        System.out.println("Total Sales: $" + sale);
        System.out.println("Total Commision: $" + comm);
        System.out.println("Top Performer: " + per);
    }
}

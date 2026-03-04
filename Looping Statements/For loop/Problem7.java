import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tot = 0;
        double rev = 0;
        
        int n = sc.nextInt();
        

        for(int i=0; i<n; i++){
            String consumerID = sc.next();
            int unitscon = sc.nextInt();
            System.out.println("Consumer ID: " + consumerID);
            System.out.println("Units Consumed: " + unitscon);
            tot += unitscon;
            
            double bill = 0;
            String category ="";
            if (unitscon > 0 && unitscon <= 100 ){
                bill = unitscon * 0.10;
                category = "Low Usage";
            }
            else if (unitscon > 100 && unitscon <= 200){
                bill = unitscon * 0.13;
                category = "Low Usage";
            }
            else if (unitscon > 200 && unitscon <= 300){
                bill = unitscon * 0.16;
                category = "Medium Usage";
            }
            else if (unitscon > 300){
                bill = unitscon * 0.20;
                category = "High Usage";
            }
            rev += bill;

            System.out.println("Bill Amount: $" + bill);
            System.out.println("Category: " + category + '\n');
        }
        double avg = rev / n;

        System.out.println("Total Consumers: " + n);
        System.out.println("Total Units Consumed: " + tot);
        System.out.printf("Total Revenue: $%.2f\n", rev);
        System.out.printf("Average Bill: $%.2f", avg);

        sc.close();
    }
}

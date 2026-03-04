import java.util.*;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int low = 0,cri = 0,overrec = 0;;
        
        for (int i=0; i<n; i++){
            String prdname = sc.next();
            int curstock = sc.nextInt();
            int minstock = sc.nextInt();
            String sts = "";
            if (curstock >= minstock)
                sts = "Adequate";
            else if ((curstock < minstock) && (curstock >= minstock/2)){
                sts = "Low Stock";
                low++;
            }
            else if (curstock < minstock/2){
                sts = "Critical";
                cri++;
            }

            int rec = 0;
            switch(sts){
                case "Adequate":
                    break;
                case "Low Stock":
                    rec = (minstock - curstock) + minstock / 2;
                    break;
                case "Critical":
                    rec = (minstock - curstock) + minstock * (3/2);
                    break;
            }
            overrec+=rec;

            System.out.println("Product: " + prdname);
            System.out.println("Current Stock: " + curstock);
            System.out.println("Minimum Stock: " + minstock);
            System.out.println("Status: " + sts);
            System.out.println("Reorder Quantity: " + rec + '\n');

        }
        System.out.println("Total Product: " + n);
        System.out.println("Low Stock Items: " + low);
        System.out.println("Critical Items: " + cri);
        System.out.println("Total Reorder Quantity: " + overrec);

        
        sc.close();
    }
}

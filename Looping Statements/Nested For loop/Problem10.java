import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pro = sc.nextInt();
        int vend = sc.nextInt();
        
        System.out.println("\nPrice Comparison Matrix: ");
        System.out.println("Product Vendor1 Vendor2 Vendor3 Vendor4 BestPrice");
        for (int i=0 ; i<pro ; i++){
            double min = Double.MAX_VALUE;
            String product = sc.next();
            System.out.printf("%s ",product);
            for (int j=0 ; j<vend ; j++){
                double price = sc.nextDouble();
                min = Math.min(min,price);
                System.out.printf("%.2f ",price);
            }
            System.out.printf("%.2f\n",min);
        }

        sc.close();
    }
    
}

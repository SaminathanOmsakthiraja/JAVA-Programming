import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dec = sc.nextInt(),dp = dec;
        int bin = 0, place = 1;

        while (dec != 0) {
            int rem = dec % 2;
            bin += rem * place;
            place *= 10;
            dec /= 2;
        }
        
        System.out.println("Decimal: " + dp);
        System.out.println("Binary: " + bin);
        sc.close();
    }
    
}

import java.util.*;
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int price = sc.nextInt();
        int serviceCharges = sc.nextInt();
        int commission = sc.nextInt();
        int value = (rooms * price) + serviceCharges - commission;
        System.out.println (value);
        sc.close();
    }
}

import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomcrg = sc.nextInt();
        int days = sc.nextInt();
        int medcost = sc.nextInt();
        int labfees = sc.nextInt();
        int inscovg = sc.nextInt();
        int value = ( roomcrg * days ) + medcost + labfees - inscovg;
        System.out.println (value);
        sc.close();
    }
}

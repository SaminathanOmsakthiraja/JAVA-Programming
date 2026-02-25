import java.util.*;
public class Problem20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ads = sc.nextInt();
        int sponsor = sc.nextInt();
        int affiliate = sc.nextInt();
        int tax = sc.nextInt();
        int production = sc.nextInt();
        int value = ads + sponsor + affiliate - tax - production;
        System.out.println (value);
        sc.close();
    }
}

import java.util.*;
public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resUsage = sc.nextInt();
        int resRate = sc.nextInt();
        int comUsage = sc.nextInt();
        int comRate = sc.nextInt();
        int connection = sc.nextInt();
        int penalty = sc.nextInt();
        int maintenance = sc.nextInt();
        int treatment = sc.nextInt();
        int value = (resUsage * resRate) + (comUsage * comRate) + connection + penalty - maintenance - treatment;
        System.out.println (value);
        sc.close();
    }
}

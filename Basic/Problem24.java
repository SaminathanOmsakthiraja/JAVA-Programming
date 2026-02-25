import java.util.*;
public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reg = sc.nextInt();
        int brc = sc.nextInt();
        int sps = sc.nextInt();
        int prz = sc.nextInt();
        int rnt = sc.nextInt();
        int adv = sc.nextInt();
        int value = reg + brc + sps - prz - rnt - adv;
        System.out.println (value);
        sc.close();
    }
}

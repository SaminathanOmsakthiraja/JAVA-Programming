import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dst = sc.nextInt();
        int rte = sc.nextInt();
        int mnt = sc.nextInt();
        int alw = sc.nextInt();
        int sbs = sc.nextInt();
        int value = (dst * rte) + mnt + alw - sbs;
        System.out.println (value);
        sc.close();
    }
}

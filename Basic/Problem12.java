import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tkt = sc.nextInt();
        int snk = sc.nextInt();
        int mnt = sc.nextInt();
        int elc = sc.nextInt();
        int value = tkt + snk - mnt - elc;
        System.out.println (value);
        sc.close();
    }
}

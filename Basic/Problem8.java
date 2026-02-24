import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rodphr = sc.nextInt();
        int hrsWrk = sc.nextInt();
        int overtm = sc.nextInt();
        int rejtrod = sc.nextInt();
        int value = ( rodphr * hrsWrk ) + overtm - rejtrod;
        System.out.println (value);
        sc.close();
    }
}

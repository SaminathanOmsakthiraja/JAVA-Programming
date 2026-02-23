import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int ser = sc.nextInt();
        int gst = sc.nextInt();
        int split = sc.nextInt();
        total += (total * gst / 100);
        total += (total * ser / 100);
        System.out.println ( total / split );
        sc.close();
    }
}

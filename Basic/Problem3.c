import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        int dis = sc.nextInt();
        int gst = sc.nextInt();
        float result = sal + (sal * gst / 100) - (sal * dis / 100);
        System.out.println(result);
        sc.close();
    }
}

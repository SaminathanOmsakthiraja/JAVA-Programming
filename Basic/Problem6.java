import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        int mil = sc.nextInt();
        int fuel = sc.nextInt();
        int toll = sc.nextInt();
        int value = ( dis * fuel ) / mil + toll;
        System.out.println (value);
        sc.close();
    }
}

import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int extra = sc.nextInt();
        int rate = sc.nextInt();
        int tax = sc.nextInt();
        float result = base + (extra * rate);
        result += (result * tax / 100);
        System.out.println(result);
        sc.close();
    }
}

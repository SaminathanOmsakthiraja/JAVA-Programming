import java.util.*;
public class Problem22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copies = sc.nextInt();
        int cost = sc.nextInt();
        int editing = sc.nextInt();
        int design = sc.nextInt();
        int commission = sc.nextInt();
        int marketing = sc.nextInt();
        int value = (copies * cost) + editing + design - commission - marketing;
        System.out.println (value);
        sc.close();
    }
}

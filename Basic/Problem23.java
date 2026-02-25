import java.util.*;
public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int rate = sc.nextInt();
        int priority = sc.nextInt();
        int design = sc.nextInt();
        int handling = sc.nextInt();
        int fuel = sc.nextInt();
        int value = (weight * rate) + design - handling + priority - fuel;
        System.out.println (value);
        sc.close();
    }
}

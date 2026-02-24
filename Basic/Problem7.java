import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayW = sc.nextInt();
        int wage = sc.nextInt();
        int over = sc.nextInt();
        int mant = sc.nextInt();
        int value = ( dayW * wage ) + over - mant;
        System.out.println (value);
        sc.close();
    }
}

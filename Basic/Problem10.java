import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deliv = sc.nextInt();
        int payot = sc.nextInt();
        int incnt = sc.nextInt();
        int flcst = sc.nextInt();
        int value = (deliv * payot) + incnt - flcst;
        System.out.println (value);
        sc.close();
    }
}

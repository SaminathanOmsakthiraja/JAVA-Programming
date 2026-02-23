import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tut = sc.nextInt();
        int sch = sc.nextInt();
        int ex = sc.nextInt();
        int lib = sc.nextInt();
        int fin = tut -( tut * sch / 100)+ ex + lib;
        System.out.println(fin);
        sc.close();
    }
}

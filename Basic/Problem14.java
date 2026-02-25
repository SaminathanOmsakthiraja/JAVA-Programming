import java.util.*;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseSalary = sc.nextInt();
        int sessions = sc.nextInt();
        int payPerSession = sc.nextInt();
        int bonus = sc.nextInt();
        int maintenanceFee = sc.nextInt();
        int value = baseSalary + (sessions * payPerSession) + bonus - maintenanceFee;
        System.out.println (value);
        sc.close();
    }
}

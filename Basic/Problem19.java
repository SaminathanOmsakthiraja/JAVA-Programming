import java.util.*;
public class Problem19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int rent = sc.nextInt();
        int late = sc.nextInt();
        int fuel = sc.nextInt();
        int maintenance = sc.nextInt();
        int value = (days * rent) + late - fuel - maintenance;
        System.out.println (value);
        sc.close();
    }
}

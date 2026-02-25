import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yieldPerAcre = sc.nextInt();
        int acres = sc.nextInt();
        int extraYield = sc.nextInt();
        int damagedCrops = sc.nextInt();
        int value = (yieldPerAcre * acres) + extraYield - damagedCrops;
        System.out.println (value);
        sc.close();
    }
}

import java.util.*;
public class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perrat = sc.nextInt();
        int yrser = sc.nextInt();
        String dpt = sc.next();
        double salary = sc.nextDouble();
        int bonusper = 0;
        if ( perrat >=3) {
            if (dpt.equals("Critical")){
                if (perrat==5 && yrser >5)
                    bonusper = 25;
                else if (perrat==4 && yrser >10)
                    bonusper = 22;
                else if (perrat==4)
                    bonusper = 15;
                else if (perrat==3)
                    bonusper = 10;
            }
            else{
                if (perrat==5)
                    bonusper = 18;
                else if (perrat==4)
                    bonusper = 12;
                else if (perrat==3)
                    bonusper = 8;
            }
        }
        float bonus = (float) salary*bonusper/100;
        System.out.println("Performance Rating: "+perrat);
        System.out.println("Year of Service: "+yrser);
        System.out.println("Department: "+dpt);
        System.out.println("Bonus Percentage: "+bonusper+"%");
        System.out.println("Bonus Amount: $"+bonus);
        System.out.println("Status: "+(perrat>=3?"Eligible":"Not Eligible"));
        sc.close();
    }
}

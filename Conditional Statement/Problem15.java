import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usercount = sc.nextInt();
        String licencetype = sc.next();
        String supportlevel = sc.next();
        int contractyear = sc.nextInt();

        System.out.println("User Count: " + usercount);
        System.out.println("License Type: " + licencetype);
        System.out.println("Support Level: " + supportlevel);
        System.out.println("Contract Duration: " + contractyear);

        double baseprice = 0;
        if (licencetype.equalsIgnoreCase("Standard")) 
            baseprice = 60;
        else if (licencetype.equalsIgnoreCase("Professional")) 
            baseprice = 120;
        else if (licencetype.equalsIgnoreCase("Enterprise")) 
            baseprice = 200;
        System.out.println("Base Price Per User: $" + baseprice);

        int volumeDiscount = 0;
        if (usercount > 0 && usercount <= 50)
            volumeDiscount = 0;
        else if (usercount > 50 && usercount <= 200)
            volumeDiscount = 15;
        else if (usercount > 200 && usercount <= 500)
            volumeDiscount = 20;
        else if (usercount > 500 && usercount <= 1000)
            volumeDiscount = 25;
        else if (usercount > 1000) 
            volumeDiscount = 35;
        System.out.println("Volume Discount: " + volumeDiscount + "%");

        double supportCost = 0;
        if (supportlevel.equalsIgnoreCase("Basic"))
            supportCost = 10;
        else if (supportlevel.equalsIgnoreCase("Priority"))
            supportCost = 30;
        else if (supportlevel.equalsIgnoreCase("Premium"))
            supportCost = 80;
        System.out.println("Support Fee Per User: $" + supportCost);

        int multiYearDiscount = 0;
        if (contractyear == 1)
            multiYearDiscount = 0;
        else if (contractyear == 2)
            multiYearDiscount = 5;
        else if (contractyear == 3)
            multiYearDiscount = 10;
        else if (contractyear == 5)
            multiYearDiscount = 20;
        System.out.println("Multi-Year Discount: " + multiYearDiscount + "%");

        double discountedBase = baseprice * (1 - volumeDiscount/100);
        double annualperuser = (discountedBase + supportCost) * (1 - multiYearDiscount/100);
        System.out.println("Annual Cost Per User: $" + annualperuser);

        double totalannualcost = annualperuser * usercount;
        System.out.println("Total Annual Cost: $" + totalannualcost);

        double contractcost = totalannualcost * contractyear;
        System.out.println("Total Contract Cost: $" + contractcost);

        String pricingtire = "";
        if (usercount < 200)
            pricingtire = "Small Business";
        else if (usercount >= 200 && usercount <= 1000)
            pricingtire = "Mid-Market";
        else if (usercount > 1000)
            pricingtire = "Enterprise";

        System.out.println("Pricing Tier: " + pricingtire);

        sc.close();
    }
}

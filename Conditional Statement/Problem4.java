import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loy = sc.next();
        double car = sc.nextDouble();
        String pro = sc.next();
        String mem = sc.next();
        int base = 0,add = 0,tot = 0;
        double fin = 0, sav = 0;

        if (loy.equals("Bronze"))
            base = 5;
        else if (loy.equals("Silver"))
            base = 8;
        else if (loy.equals("Gold"))
            base = 12;
        else if (loy.equals("Platinum"))
            base = 15;

        if (car > 500 && car <1000)
            add+=3;
        else if (car >= 1000 && car < 2000)
            add+=5;
        else if (car >= 2000)
            add+=7;

        if (pro.equals("Electronics")){
            if (mem.equals("Premium"))
                add+=5;
        }
        else if (pro.equals("Fashion"))
                add+=3;
        else if (pro.equals("Books")){
            if (mem.equals("Premium"))
                add+=5;
        }
        else  if (pro.equals("Groceries")){
            if (car >= 300)
                add+=2;
        }

        tot = base + add;
        fin = car * tot / 100;
        sav = car - fin;

        System.out.println();
        System.out.println("Loyalty Tier: "+loy);
        System.out.println("Cart Value: $"+car);
        System.out.println("Product Category: "+pro);
        System.out.println("Membership: "+mem);
        System.out.println("Base Discount: "+base+"%");
        System.out.println("Additional Discount: "+add+"%");
        System.out.println("Total Discount: "+tot+"%");
        System.out.println("Final Price: $"+fin);
        System.out.println("Saving: $"+sav);

        sc.close();
    }
}

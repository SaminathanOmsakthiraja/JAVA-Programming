import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();
        int months = sc.nextInt();
        sc.nextLine();
        String access = sc.nextLine();
        String addOn = sc.nextLine();

        double baseFee = 0;
        int discount = 0;
        double accessFee = 0;
        double addOnFee = 0;
        String category = "";

        if (tier.equals("Basic")) {
            baseFee = 40;
        } else {
            if (tier.equals("Premium")) {
                baseFee = 80;
            } else {
                if (tier.equals("Elite")) {
                    baseFee = 120;
                } else {
                    if (tier.equals("VIP")) {
                        baseFee = 150;
                    }
                }
            }
        }

        if (months == 1) {
            discount = 0;
        } else {
            if (months == 6) {
                discount = 10;
            } else {
                if (months == 12) {
                    discount = 15;
                } else {
                    if (months == 24) {
                        discount = 25;
                    }
                }
            }
        }

        if (access.equals("Single-Location")) {
            accessFee = 0;
        } else {
            if (access.equals("Regional")) {
                accessFee = 20;
            } else {
                if (access.equals("Nationwide")) {
                    accessFee = 50;
                }
            }
        }

        if (addOn.equals("None")) {
            addOnFee = 0;
        } else {
            if (addOn.equals("Personal-Training")) {
                addOnFee = 100;
            } else {
                if (addOn.equals("Classes")) {
                    addOnFee = 50;
                } else {
                    if (addOn.equals("Full-Package")) {
                        addOnFee = 200;
                    }
                }
            }
        }

        double discountedBase = baseFee * (1 - discount / 100.0);
        double monthlyTotal = discountedBase + accessFee + addOnFee;
        double contractTotal = monthlyTotal * months;

        double normalTotal = (baseFee + accessFee + addOnFee) * months;
        double savings = normalTotal - contractTotal;

        if (tier.equals("Basic")) {
            category = "Budget";
        } else {
            if (tier.equals("Premium")) {
                if (monthlyTotal > 120) {
                    category = "Premium";
                } else {
                    category = "Standard";
                }
            } else {
                if (tier.equals("Elite")) {
                    category = "Premium";
                } else {
                    if (tier.equals("VIP")) {
                        category = "Luxury";
                    }
                }
            }
        }

        System.out.println("Membership Tier: " + tier);
        System.out.println("Contract Length: " + months + " months");
        System.out.println("Access Level: " + access);
        System.out.println("Add-Ons: " + addOn);
        System.out.println("Base Monthly Fee: $" + baseFee);
        System.out.println("Contract Discount: " + discount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addOnFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);

        sc.close();
    }
}

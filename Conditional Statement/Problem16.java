import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nights = sc.nextInt();
        sc.nextLine();
        String loyalty = sc.nextLine();

        double baseRate = 0;
        double multiplier = 1.0;
        int extendedDiscount = 0;
        int loyaltyDiscount = 0;
        String upgrades = "None";

        if (roomCategory.equals("Standard")) {
            baseRate = 150;
        } else {
            if (roomCategory.equals("Deluxe")) {
                baseRate = 300;
            } else {
                if (roomCategory.equals("Suite")) {
                    baseRate = 500;
                } else {
                    if (roomCategory.equals("Presidential")) {
                        baseRate = 1000;
                    }
                }
            }
        }

        if (season.equals("Off-Peak")) {
            multiplier = 0.7;
        } else {
            if (season.equals("Regular")) {
                multiplier = 1.0;
            } else {
                if (season.equals("Peak")) {
                    multiplier = 1.5;
                } else {
                    if (season.equals("Holiday")) {
                        multiplier = 2.0;
                    }
                }
            }
        }

        if (nights >= 1 && nights <= 4) {
            extendedDiscount = 0;
        } else {
            if (nights >= 5 && nights <= 7) {
                extendedDiscount = 5;
            } else {
                if (nights >= 8 && nights <= 14) {
                    extendedDiscount = 10;
                } else {
                    if (nights >= 15) {
                        extendedDiscount = 20;
                    }
                }
            }
        }

        if (loyalty.equals("None")) {
            loyaltyDiscount = 0;
        } else {
            if (loyalty.equals("Member")) {
                loyaltyDiscount = 10;
            } else {
                if (loyalty.equals("Gold")) {
                    loyaltyDiscount = 15;
                } else {
                    if (loyalty.equals("Platinum")) {
                        loyaltyDiscount = 20;
                    }
                }
            }
        }

        double seasonalRate = baseRate * multiplier;
        double discountedRate = seasonalRate * (1 - extendedDiscount / 100.0) * (1 - loyaltyDiscount / 100.0);
        double totalCost = discountedRate * nights;

        if (loyalty.equals("Gold") && roomCategory.equals("Deluxe")) {
            upgrades = "Free breakfast and spa access";
        } else {
            if (loyalty.equals("Platinum") && roomCategory.equals("Presidential")) {
                upgrades = "Concierge service, airport transfer, and fine dining";
            } else {
                if (loyalty.equals("Member") && roomCategory.equals("Suite")) {
                    upgrades = "Free breakfast";
                } else {
                    upgrades = "None";
                }
            }
        }

        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nights);
        System.out.println("Loyalty Tier: " + loyalty);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + multiplier + "x");
        System.out.println("Extended Stay Discount: " + extendedDiscount + "%");
        System.out.println("Loyalty Discount: " + loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + discountedRate);
        System.out.println("Total Booking Cost: $" + totalCost);
        System.out.println("Complimentary Upgrades: " + upgrades);

        sc.close();
    }
}

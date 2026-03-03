import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String format = sc.nextLine();
        String time = sc.nextLine();
        String seat = sc.nextLine();
        String customer = sc.nextLine();

        double basePrice = 12.0;
        double formatSurcharge = 0;
        double seatFee = 0;
        int timeAdjustment = 0;
        int customerDiscount = 0;
        String voucher = "No";
        String pricingCategory = "";

        if (format.equals("2D")) {
            formatSurcharge = 0;
        } else {
            if (format.equals("3D")) {
                formatSurcharge = 5;
            } else {
                if (format.equals("IMAX")) {
                    formatSurcharge = 8;
                } else {
                    if (format.equals("4DX")) {
                        formatSurcharge = 10;
                    }
                }
            }
        }

        if (seat.equals("Standard")) {
            seatFee = 0;
        } else {
            if (seat.equals("Premium")) {
                seatFee = 4;
            } else {
                if (seat.equals("Recliner")) {
                    seatFee = 7;
                }
            }
        }

        if (time.equals("Matinee")) {
            timeAdjustment = -30;
        } else {
            if (time.equals("Evening")) {
                timeAdjustment = 0;
            } else {
                if (time.equals("Prime-Time")) {
                    timeAdjustment = 20;
                } else {
                    if (time.equals("Late-Night")) {
                        timeAdjustment = -20;
                    }
                }
            }
        }

        if (customer.equals("Adult")) {
            customerDiscount = 0;
        } else {
            if (customer.equals("Senior")) {
                customerDiscount = 25;
            } else {
                if (customer.equals("Student")) {
                    customerDiscount = 15;
                } else {
                    if (customer.equals("Child")) {
                        customerDiscount = 30;
                    }
                }
            }
        }

        double baseWithSurcharge = basePrice + formatSurcharge + seatFee;
        double adjustedPrice = baseWithSurcharge * (1 + timeAdjustment / 100.0);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);

        if (time.equals("Matinee")) {
            voucher = "Yes";
        } else {
            if (customer.equals("Senior") || customer.equals("Student") || customer.equals("Child")) {
                voucher = "Yes";
            } else {
                voucher = "No";
            }
        }

        if (finalPrice < 10) {
            pricingCategory = "Value";
        } else {
            if (finalPrice < 25) {
                pricingCategory = "Premium";
            } else {
                if (finalPrice >= 25 && finalPrice < 30) {
                    pricingCategory = "Premium";
                } else {
                    pricingCategory = "Luxury";
                }
            }
        }

        System.out.println("Movie Format: " + format);
        System.out.println("Show Time: " + time);
        System.out.println("Seat Category: " + seat);
        System.out.println("Customer Type: " + customer);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatFee);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.println("Final Ticket Price: $" + Math.round(finalPrice * 100.0) / 100.0);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + pricingCategory);

        sc.close();
    }
}

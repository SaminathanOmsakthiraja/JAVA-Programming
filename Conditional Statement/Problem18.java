import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        sc.nextLine();
        String zone = sc.nextLine();
        String speed = sc.nextLine();
        String size = sc.nextLine();

        double baseRate = 0;
        double weightSurcharge = weight * 1.0;
        double zoneMultiplier = 1.0;
        double sizeSurcharge = 0;
        String delivery = "";
        String serviceLevel = "";

        if (speed.equals("Economy")) {
            baseRate = 5;
            serviceLevel = "Budget";
        } else {
            if (speed.equals("Standard")) {
                baseRate = 10;
                serviceLevel = "Standard";
            } else {
                if (speed.equals("Express")) {
                    baseRate = 25;
                    serviceLevel = "Priority";
                } else {
                    if (speed.equals("Overnight")) {
                        baseRate = 50;
                        serviceLevel = "Premium";
                    }
                }
            }
        }

        if (zone.equals("Local")) {
            zoneMultiplier = 1.0;
        } else {
            if (zone.equals("Regional")) {
                zoneMultiplier = 1.2;
            } else {
                if (zone.equals("National")) {
                    zoneMultiplier = 1.5;
                } else {
                    if (zone.equals("International")) {
                        zoneMultiplier = 3.0;
                    }
                }
            }
        }

        if (size.equals("Small")) {
            sizeSurcharge = 0;
        } else {
            if (size.equals("Medium")) {
                sizeSurcharge = 5;
            } else {
                if (size.equals("Large")) {
                    sizeSurcharge = 15;
                } else {
                    if (size.equals("Oversized")) {
                        sizeSurcharge = 30;
                    }
                }
            }
        }

        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;

        if (speed.equals("Economy")) {
            if (zone.equals("Local")) {
                delivery = "7 business days";
            } else {
                if (zone.equals("Regional")) {
                    delivery = "7 business days";
                } else {
                    if (zone.equals("National")) {
                        delivery = "7 business days";
                    } else {
                        if (zone.equals("International")) {
                            delivery = "14 business days";
                        }
                    }
                }
            }
        } else {
            if (speed.equals("Standard")) {
                if (zone.equals("Local")) {
                    delivery = "5 business days";
                } else {
                    if (zone.equals("Regional")) {
                        delivery = "5 business days";
                    } else {
                        if (zone.equals("National")) {
                            delivery = "5 business days";
                        } else {
                            if (zone.equals("International")) {
                                delivery = "10 business days";
                            }
                        }
                    }
                }
            } else {
                if (speed.equals("Express")) {
                    if (zone.equals("Local")) {
                        delivery = "2 business days";
                    } else {
                        if (zone.equals("Regional")) {
                            delivery = "2 business days";
                        } else {
                            if (zone.equals("National")) {
                                delivery = "2 business days";
                            } else {
                                if (zone.equals("International")) {
                                    delivery = "3 business days";
                                }
                            }
                        }
                    }
                } else {
                    if (speed.equals("Overnight")) {
                        delivery = "1 business days";
                    }
                }
            }
        }

        System.out.println("Package Weight: " + weight + " lbs");
        System.out.println("Destination Zone: " + zone);
        System.out.println("Shipping Speed: " + speed);
        System.out.println("Package Size: " + size);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + delivery);
        System.out.println("Service Level: " + serviceLevel);

        sc.close();
    }
}

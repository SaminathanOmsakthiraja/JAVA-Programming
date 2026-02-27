import java.util.*;
public class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int gp=0;
        String smksts = sc.next();
        String preexisting = sc.next();
        String coverage = sc.next();
        double base = 0,risk = 0,total = 0;

        if (age >=18 && age <=30){
            gp = 1;
            if (coverage.equals("Basic"))
                base = 200;
            else if(coverage.equals("Standard"))
                base = 300;
            else if(coverage.equals("Premium"))
                base = 500;
        }
        else if (age >30 && age <=50){
            gp = 2;
            if (coverage.equals("Basic"))
                base = 250;
            else if(coverage.equals("Standard"))
                base = 350;
            else if(coverage.equals("Premium"))
                base = 500;
        }
        else if (age >50 && age <=65){
            gp = 3;
            if (coverage.equals("Basic"))
                base = 350;
            else if(coverage.equals("Standard"))
                base = 450;
            else if(coverage.equals("Premium"))
                base = 700;
        }
        else if (age>65){
            gp = 4;
            if (coverage.equals("Basic"))
                base = 400;
            else if(coverage.equals("Standard"))
                base = 550;
            else if(coverage.equals("Premium"))
                base = 800;
        }

        
        if (smksts.equals("Smoker")) {
            if (preexisting.equals("Yes")) {
                risk = base * 70/100;
            } else {
                risk = base * 40/100;
            }
        } else {
            if (preexisting.equals("Yes")) {
                risk = base * 30/100;
            } else {
                risk = 0;
            }
        }

        total = base + risk;

        System.out.println();
        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smksts);
        System.out.println("Pre-existing Conditions: " + preexisting);
        System.out.println("Coverage Tier: " + coverage);
        System.out.println("Base Premium: $" + base);
        System.out.println("Risk Surcharge: $" + risk);
        System.out.println("Total Monthly Premium: $" + total);
        sc.close();
    }
}

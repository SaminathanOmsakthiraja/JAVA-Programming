import java.util.*;
public class Problem5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double income = sc.nextDouble();
        int exsc = sc.nextInt();
        String sch = sc.next();

        double amt = 0;
        String category = "None";
        String eligibility = (gpa >= 2.5 )?"Eligible":"Not Eligible";

        if (sch.equals("Merit")){
            if (gpa >= 3.8 && exsc >=80){
                category = "Full";
                amt = 25000;
            }
            else if (gpa >= 3.5 && exsc >= 70){
                category = "Partial";
                amt = 15000;
            }
            else if (gpa >= 3.0 && exsc >= 60){
                category = "Minimal";
                amt = 10000;
            }
        }
        else if (sch.equals("Need-Based")){
            if ((income <= 30000) && gpa >= 3.5){
                category = "Full";
                amt = 30000;
            }
            else if ((income < 50000) && gpa >= 3.0){
                category = "Partial";
                amt = 18000;
            }
            else if ((income < 70000) && gpa >= 2.8){
                category = "Minimal";
                amt = 10000;
            }
        }
        else if (sch.equals("Sports")){
            if (exsc >= 85 && gpa >= 3.0){
                category = "Full";
                amt = 22000;
            }
            else if (exsc >= 75 && gpa >= 2.8){
                category = "Partial";
                amt = 20000;
            }
            else if (exsc >= 65 && gpa >= 2.5){
                category = "Minimal";
                amt = 12000;
            }
        }
        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + income);
        System.out.println("Extracurricular Score: " + exsc);
        System.out.println("Scholarship Type: " + sch);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Aware Amount: $" + amt);
        System.out.println("Award Category : " + category);

        sc.close();
    }
}

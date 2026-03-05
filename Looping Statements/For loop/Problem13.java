import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int eligible = 0;
        int rejected = 0;

        for(int i = 0; i < n; i++){

            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemo = sc.nextDouble();

            String status = "Eligible";
            String reason = "";

            if(age < 18){
                status = "Not Eligible";
                reason = "Age below 18 years";
            }
            else if(age > 65){
                status = "Not Eligible";
                reason = "Age above 65 years";
            }
            else if(weight < 50){
                status = "Not Eligible";
                reason = "Weight below 50 kg";
            }
            else if(hemo < 12.5){
                status = "Not Eligible";
                reason = "Hemoglobin below 12.5 g/dL";
            }

            if(status.equals("Eligible"))
                eligible++;
            else
                rejected++;

            System.out.println("Donor: " + name);
            System.out.println("Age: " + age + " years");
            System.out.printf("Weight: %.1f kg\n", weight);
            System.out.printf("Hemoglobin: %.1f g/dL\n", hemo);
            System.out.println("Status: " + status);

            if(status.equals("Not Eligible"))
                System.out.println("Reason: " + reason);

            System.out.println();
        }

        double rate = ((double)eligible / n) * 100;

        System.out.println("Total Donors: " + n);
        System.out.println("Eligible Donors: " + eligible);
        System.out.println("Rejected Donors: " + rejected);
        System.out.printf("Eligibility Rate: %.2f%%\n", rate);

        sc.close();
    }
}
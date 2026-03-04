import java.util.*;

public class Problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        for(int i=0; i<n; i++){
            String name = sc.next();
            double base = sc.nextInt();
            int perform = sc.nextInt();
            double inc = 0;
            if (perform == 5)
                inc = 15;
            else if (perform == 4)
                inc = 10;
            else if (perform == 3)
                inc = 5;
            else if (perform == 2)
                inc = 2;
            else if (perform == 1)
                inc = 0;

            sum += base;
            double fin = base * (1 + inc/100.0);
            System.err.println("Employee: " + name);
            System.out.println("Base Salary: $" + base);
            System.out.println("Performance Rating: " + perform);
            System.out.println("Increment: " + inc + "%");
            System.out.println("Final Salary: $" + fin);
            System.out.println();
        }
        System.out.println("Total Employees Processed: " + n);
        System.out.println("Total Payroll: $" + sum);
        System.out.printf("Average Salary: $%.2f", sum/n);

        sc.close();
    }
}

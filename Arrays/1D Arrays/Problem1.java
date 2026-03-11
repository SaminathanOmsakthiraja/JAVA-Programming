import java.util.*;
public class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] arr = new double[n];
        double sum=0;

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i]; 
        }
        double avg = sum / n;
        int count = 0;
        for(int i=0 ; i<n ; i++){
            if (arr[i] > avg)
                count++;
        }
        System.out.println("\nTotal Employee: " + n);
        System.out.printf("Average Salary: %.2f\n" , avg);
        System.out.println("Employees Above Average: " + count);
        System.out.printf("Percentage: %.2f%%" , (count * 100.00)/n);


        sc.close();
    }
}
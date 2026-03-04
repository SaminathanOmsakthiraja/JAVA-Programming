import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, high = 0, pass = 0, fail = 0;
        for (int i = 0; i < n; i++){
            String name = sc.next();
            int score = sc.nextInt();
            char gr = 'F';
            if (score >=85 && score <= 100)
                gr = 'A';
            else if (score >= 70 && score < 85)
                gr = 'B';
            else if (score >= 60 && score < 70)
                gr = 'C';
            else if (score >= 50 && score < 60)
                gr = 'D';
            else if (score >= 0 && score < 50)
                gr = 'F';
            
            String sts = "";
            if (score >= 60){
                sts = "Pass";
                pass++;
            }
            else {
                sts = "Fail";
                fail++;
            }
            if (score > high)
                high = score;

            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + gr);
            System.out.println("Status: " + sts +'\n');

            sum += score;
        }
        float avg = sum/n;
        System.out.println("Total Students: " + n);
        System.out.printf("Class Average: %.2f\n" , avg);
        System.out.println("Highest Score: " + high);
        System.out.println("Student Passed: " + pass);
        System.err.println("Student Failed: " + fail);

        sc.close();
    }
}

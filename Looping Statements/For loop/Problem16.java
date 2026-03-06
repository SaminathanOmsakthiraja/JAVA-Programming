import java.util.*;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0, pass = 0, fail = 0, high = 0;

        for (int i=0; i<n; i++){
            String stdname = sc.next();
            int crtans = sc.nextInt();
            int wrgans = sc.nextInt();
            int unattept = sc.nextInt();

            int score = (crtans * 4) - (wrgans * 3) + (unattept * 0);
            total += score;

            System.out.println("Student: " + stdname);
            System.out.println("Correct: " + crtans);
            System.out.println("Wrong: " + wrgans);
            System.out.println("Score: " + score);
            if (score >= 32){
                System.out.println("Result: Pass\n");
                pass++;
            }
            else{
                System.out.println("Result: Fail\n");
                fail++;
            }
            if (score > high)
                high = score;
        }
        double avg = total / n;
        System.out.println("Total Student: " + n);
        System.out.println("Pass Count: " + pass);
        System.out.println("Fail Count: " + fail);
        System.out.printf("class Average: %.1f\n" , avg);
        System.out.println("Highest Score: " + high);

        sc.close();
    }   
}
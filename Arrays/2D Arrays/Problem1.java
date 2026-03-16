import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int subjects = sc.nextInt();

        int[][] arr = new int[students][subjects];

        for(int i = 0; i < students; i++){
            for(int j = 0; j < subjects; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Student Averages:");

        for(int i = 0; i < students; i++){

            int sum = 0;

            for(int j = 0; j < subjects; j++){
                sum += arr[i][j];
            }

            double avg = (double) sum / subjects;

            System.out.printf("Student %d : %d\n",(i+1),(int) avg*100);
        }

        System.out.println();
        System.out.println("Subject Averages:");

        for(int j = 0; j < subjects; j++){

            int sum = 0;

            for(int i = 0; i < students; i++){
                sum += arr[i][j];
            }

            double avg = (double) sum / students;

            System.out.printf("Subject %d : %d\n",(j+1), (int) avg*100);
        }
        sc.close();
    }
}
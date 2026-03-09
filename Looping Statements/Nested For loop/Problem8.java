import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int perfect = 0;
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("\nAttendance Matrix:");
        System.out.println("Student Day1 Day2 Day3 Day4 Day5 Attendance%"); 
        for (int i=0 ; i<n ; i++){
            double attend = 0;
            String name = sc.next();
            System.out.printf("%s ",name);
            for (int j=0 ; j<m ;j++){
                char at = sc.next().charAt(0);
                System.out.printf("%c ",at);
                if (at=='P'){
                    attend++;
                }
            }
            if (attend == m)
                perfect++;
            double per = (100.0 / m) * attend; 
            System.out.printf("%.2f%% \n",per);
        }
        System.out.println("\nPerfect Attendance: " + perfect + " students");
        

        sc.close();
    }
    
}

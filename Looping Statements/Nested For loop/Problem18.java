import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int per = sc.nextInt();

        String[][] arr = new String[day][per];

        for (int i = 0; i < day; i++) {
            for (int j = 0; j < per; j++) {
                arr[i][j] = sc.next();
            }
        }

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("Class Time Table:");

        System.out.print("Day ");
        for(int i = 1; i <= per; i++){
            System.out.print("Period" + i + " ");
        }
        System.out.println();

        for(int i = 0; i < day; i++){
            System.out.print(days[i] + " ");
            for(int j = 0; j < per; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
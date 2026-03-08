import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int seat = sc.nextInt();
        int total = row * seat;

        for (int x=1; x<=row; x++){
            System.out.printf("Row %d: ",x);
            for (int y=1; y<=seat; y++){
                System.out.printf("Seat-%d ",y);
            }
            System.out.println();
        }
        System.out.println("\nTotal Seats: " + total);

        sc.close();
    }   
}
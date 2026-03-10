import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int occ = sc.nextInt();

        int total = a * b;
        int c = 1;
        System.out.println("Exam Seating Plan:");
        for (int i=0 ; i<a*2 ; i++){
            for (int j=0 ; j<b ; j++){
                if ((i+j)%2==0 && c<=occ){
                    System.out.printf("S%03d ",c);
                    c++;
                }
                else
                    System.out.printf("---- ");
            }
            System.out.println();
        }
        System.out.println("Total Seats: " + total);
        System.out.println("Occupied Seats: " + b);
        System.out.println("Empty Seats: " + (total-b));

        sc.close();
    }
    
}

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int deps = sc.nextInt();

        int[][] emp = new int[deps][];

        int total = 0;

        for (int i = 0; i < deps; i++){
            int size = sc.nextInt();
            emp[i] = new int[size];

            for (int j = 0; j < size; j++){
                emp[i][j] = sc.nextInt();
                total++;
            }
        }

        System.out.println("Employee Contact Book:");
        for (int i = 0; i < deps; i++){
            System.out.printf("Dept %d: ", i + 1);
            for (int j = 0; j < emp[i].length; j++){
                System.out.printf("%d ", emp[i][j]);
            }
            System.out.println();
        }

        System.out.printf("\nTotal Employees: %d", total);

        sc.close();
    }
}
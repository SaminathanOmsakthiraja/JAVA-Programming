import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxDefects = sc.nextInt();

        int[] arr = new int[n];
        int count = 0;

        StringBuilder str = new StringBuilder("[");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > maxDefects){
                count++;
                str.append(i + 1);
                str.append(", ");
            }
        }

        if(count > 0){
            str.delete(str.length() - 2, str.length());
        }

        str.append("]");

        double compliance = ((double)(n - count) / n) * 100;

        System.out.println("Production Lines: " + n);
        System.out.println("Acceptable Threshold: " + maxDefects);
        System.out.println("Lines Exceeding Threshold: " + count);
        System.out.println("Critical Lines: " + str.toString());
        System.out.printf("Compliance Rate: %.2f%%", compliance);

        sc.close();
    }
}
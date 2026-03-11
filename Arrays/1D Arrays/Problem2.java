import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int threshold = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;

        StringBuilder str = new StringBuilder("[");
        int i = 0;

        for (i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if (arr[i] < threshold){
                count++;
                str.append(i);
                str.append(", ");
            }
        }

        if(count > 0){
            str.delete(str.length() - 2, str.length());
        }

        str.append("]");

        System.out.println("Total Products: " + n);
        System.out.println("Minimum Threshold: " + threshold);
        System.out.println("Low Stock Products: " + count);
        System.out.println("Product Indices: " + str.toString());

        sc.close();
    } 
}
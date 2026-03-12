import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;
        int max = 0;
        int idx = 0;

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
            sum += arr[i];

            if(arr[i] > max){
                max = arr[i];
                idx = i;
            }

        }

        int avg = sum / n;

        double threshold = avg * 0.5;

        int low = 0;

        String str = "[";

        for(int i=0;i<n;i++){

            if(arr[i] < threshold){
                low++;
                str += (i+1) + ", ";
            }

        }

        if(low > 0){
            str = str.substring(0,str.length()-2);
        }

        str += "]";

        double health = ((double)(n-low)/n) * 100;

        System.out.println("Products Analyzed: " + n);
        System.out.println("Total Inventory: " + sum);
        System.out.println("Average Stock Level: " + avg);
        System.out.println("Highest Stock Product: Product " + (idx+1) + " (" + max + ")");
        System.out.println("Low Stock Products (<50% avg): " + low);
        System.out.println("Restock Alert List: " + str);
        System.out.println("Inventory Health: " + String.format("%.2f", health) + "%");

        sc.close();
    }
}
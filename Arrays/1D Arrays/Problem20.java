import java.util.Scanner;
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;
        int max = 0;
        int min = 100000;

        int maxIdx = 0;
        int minIdx = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIdx = i;
            }
        }
        double avg = (double)sum / n;
        double threshold = avg * 0.9;
        int under = 0;

        String str = "[";

        for(int i=0;i<n;i++){

            if(arr[i] < threshold){
                under++;
                str += (i+1) + ", ";
            }

        }

        if(under > 0){
            str = str.substring(0,str.length()-2);
        }

        str += "]";

        int meetTarget = 0;

        for(int i=0;i<n;i++){

            if(arr[i] >= target){
                meetTarget++;
            }

        }

        double rate = ((double)meetTarget / n) * 100;

        System.out.println("Production Lines: " + n);
        System.out.println("Daily Target: " + target + " units");
        System.out.println("Total Production: " + sum + " units");
        System.out.println("Average Output: " + String.format("%.2f", avg) + " units");
        System.out.println("Best Performing Line: Line " + (maxIdx+1) + " (" + max + " units)");
        System.out.println("Worst Performing Line: Line " + (minIdx+1) + " (" + min + " units)");
        System.out.println("Underperforming Lines (<90% avg): " + under);
        System.out.println("Maintenance Priority: " + str);
        System.out.println("Target Achievement Rate: " + String.format("%.2f", rate) + "%");

        sc.close();
    }
}
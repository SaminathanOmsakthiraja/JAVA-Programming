import java.util.Scanner;

public class Problem19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        double sum = 0;
        double max = 0;
        double min = 1000;

        int maxIdx = 0;
        int minIdx = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
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

        double avg = sum / n;
        double threshold = avg * 0.8;
        int inefficient = 0;
        String str = "[";

        for(int i=0;i<n;i++){
            if(arr[i] < threshold){
                inefficient++;
                str += (i+1) + ", ";
            }
        }

        if(inefficient > 0){
            str = str.substring(0,str.length()-2);
        }

        str += "]";

        double efficiency = ((double)(n-inefficient)/n) * 100;

        System.out.println("Fleet Vehicles: " + n);
        System.out.println("Best Fuel Efficiency: " + max + " km/l (Vehicle " + (maxIdx+1) + ")");
        System.out.println("Worst Fuel Efficiency: " + min + " km/l (Vehicle " + (minIdx+1) + ")");
        System.out.println("Average Fleet Efficiency: " + String.format("%.2f", avg) + " km/l");
        System.out.println("Inefficient Vehicles (<80% avg): " + inefficient);
        System.out.println("Maintenance Required: " + str);
        System.out.println("Fleet Efficiency Score: " + String.format("%.2f", efficiency) + "%");

        sc.close();
    }
}
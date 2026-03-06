import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double total = 0;
        double max = -999, min = 999;
        int maxh = 0, minh = 0;
        int hot = 0, cold = 0;

        for(int i=0;i<n;i++){

            int hour = sc.nextInt();
            double temp = sc.nextDouble();

            String status = "";

            if(temp > 40 || temp < 0)
                status = "Extreme";
            else if(temp >= 32)
                status = "Hot";
            else if(temp <= 10)
                status = "Cold";
            else
                status = "Normal";

            if(temp >= 32)
                hot++;

            if(temp <= 10)
                cold++;

            if(temp > max){
                max = temp;
                maxh = hour;
            }

            if(temp < min){
                min = temp;
                minh = hour;
            }

            total += temp;

            System.out.println("Hour " + hour + ": " + temp + "°C");
            System.out.println("Status: " + status);
            System.out.println();
        }

        double avg = total/n;

        System.out.println("Total Readings: " + n);
        System.out.printf("Average Temperature: %.2f°C\n",avg);
        System.out.println("Highest Temperature: " + max + "°C at Hour " + maxh);
        System.out.println("Lowest Temperature: " + min + "°C at Hour " + minh);
        System.out.println("Hot Hours: " + hot);
        System.out.println("Cold Hours: " + cold);

        sc.close();
    }
}
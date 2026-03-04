import java.util.*;

public class Problem9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalDuration = 0;
        int totalCalories = 0;

        for (int i = 1; i <= n; i++) {

            String exercise = sc.next();
            int duration = sc.nextInt();

            int calories = 0;
            String intensity = "";

            if (exercise.equals("Running")) {
                calories = duration * 10;
                intensity = "High";
            } 
            else if (exercise.equals("Swimming")) {
                calories = duration * 12;
                intensity = "High";
            } 
            else if (exercise.equals("Cycling")) {
                calories = duration * 8;
                intensity = "Moderate";
            } 
            else if (exercise.equals("Gym")) {
                calories = duration * 7;
                intensity = "Moderate";
            } 
            else if (exercise.equals("Walking")) {
                calories = duration * 4;
                intensity = "Low";
            }

            totalDuration += duration;
            totalCalories += calories;

            System.out.println("Session " + i + ": " + exercise);
            System.out.println("Duration: " + duration + " minutes");
            System.out.println("Calories Burned: " + calories);
            System.out.println("Intensity: " + intensity + '\n');;
        }

        double average = (double) totalCalories / n;

        String fitnessLevel = "";

        if (totalCalories < 300)
            fitnessLevel = "Beginner";
        else if (totalCalories <= 1000)
            fitnessLevel = "Intermediate";
        else
            fitnessLevel = "Advanced";
        
        System.out.println("Total Workouts: " + n);
        System.out.println("Total Duration: " + totalDuration + " minutes");
        System.out.println("Total Calories Burned: " + totalCalories);
        System.out.printf("Average Calories per Session: %.2f\n", average);
        System.out.println("Fitness Level: " + fitnessLevel);

        sc.close();
    }
}
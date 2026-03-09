import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stu = sc.nextInt();
        int sub = sc.nextInt();

        System.out.printf("Student ");
        for (int i=1 ; i<=sub ; i++){
            System.out.printf("Sub%d ",i);
        }
        System.err.printf("Avweage \n");
        for (int i=0 ; i<stu ; i++){
            int sum = 0;
            String name = sc.next();
            System.out.printf("%s ",name);
            for (int j=0 ; j<sub ; j++){
                int submark = sc.nextInt();
                System.out.printf("%d ",submark);
                sum += submark;
            }
            float avg = (float) sum / sub;
            System.out.printf("%.2f \n",avg);
        }

        sc.close();
    }
    
}

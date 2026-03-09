import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int mon_start = sc.nextInt();

        int cells = mon_start - 1 + days;

        System.out.println("Calendra Grid: ");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun ");

        int day=1;
        for (int i=1 ; i<=cells-days ; i++){
            int point = 1;
            if (i==1){
                for (int k=0 ; k<cells-days ; k++){
                    System.out.printf("    ");
                    point++;
                }
            }
            for (; day<=days ; day++){
                System.err.printf("%d ",day);
                if (point == 7){
                    System.err.println();
                    point=0;
                }
                point++;
            }
        }

        sc.close();
    }
    
}
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String type = sc.next();

        switch (type.toLowerCase()) {
            case "star":
                for (int i=0; i<n; i++){
                    for (int j=0; j<i; j++){
                        System.err.printf("*");
                    }
                    System.out.println();
                }
                break;
            case "number":
                for (int i=1; i<=n; i++){
                    for (int j=1; j<=i; j++)
                        System.out.printf("%d",j);
                    System.out.println();
                }
                break;
        }

        sc.close();
    }   
}
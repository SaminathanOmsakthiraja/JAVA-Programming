import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean done = true;
        
        do{
            System.out.printf("Calculator Menu:\n1. Add\n2. Subtract\n3. Multiple\n4. Divide\n5. Exit\n");
            System.out.println("Choice: ");
            int ch = sc.nextInt();
            if (ch == 5){
                System.out.println("Goodbye!");
                break;
            }
            System.out.println("Enter the number: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 0;
            switch (ch) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a/b;
                    break;
                case 5:
                    done = false;
                    break;
            }
            System.out.println("Result: " + result);
        }while(done);

        sc.close();
    }
    
}

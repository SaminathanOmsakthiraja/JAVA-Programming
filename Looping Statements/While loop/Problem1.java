import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String crtpass = sc.next();
        boolean found = false;
        int n = 3;
        while (!found && n!=0){
            --n;
            System.out.println("Enter password:");
            String attempt = sc.next();
            if (attempt.equals(crtpass)){
                System.out.println("Access granted!");
                found = true;
                break;
            }
            else if (n!=0)
                System.out.println("Incorrect! Attempts remaining: " + n);
            if(n==0)
                System.out.println("Account locked!");
        }

        sc.close();
    }
}

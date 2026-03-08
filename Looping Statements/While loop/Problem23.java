import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();
        int i = 0;
        int count = 0;
        do{
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U')
                count++;
            i++;
        }while(i < len);

        System.out.println("Text: " + str);
        System.out.println("Vowel count: " + count);
        
        sc.close();
    }
    
}

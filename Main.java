import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Safe reading with check
        if (!sc.hasNextInt()) {
            System.out.println("0");   // or handle as needed
            sc.close();
            return;
        }
        
        int M = sc.nextInt();
        
        if (!sc.hasNextInt()) {
            System.out.println("0");
            sc.close();
            return;
        }
        
        int N = sc.nextInt();
        
        int result = (M * N + 1) / 2;
        System.out.println(result);
        
        sc.close();
    }
}
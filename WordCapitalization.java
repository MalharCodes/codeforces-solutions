import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // Capitalize first letter
        String result = Character.toUpperCase(word.charAt(0)) + word.substring(1);

        System.out.println(result);
    }
}
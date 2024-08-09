import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char[] t = sc.next().toCharArray();
            if (Character.isLowerCase(t[0])) {
                t[0] = Character.toUpperCase(t[0]);
            }
            System.out.println(new String(t));
        }
    }
}

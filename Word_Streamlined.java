import java.util.Scanner;

public class Word_Streamlined {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char[] t = sc.next().toCharArray();
            int lo = 0, up = 0;
            for (char c : t) {
                if (Character.isUpperCase(c))
                    up++;
                else if (Character.isLowerCase(c))
                    lo++;
            }

            if (lo >= up) {
                for (int i = 0; i < t.length; i++) {
                    t[i] = Character.toLowerCase(t[i]);
                }
            } else {
                for (int i = 0; i < t.length; i++) {
                    t[i] = Character.toUpperCase(t[i]);
                }
            }

            System.out.println(new String(t));
        }
    }
}

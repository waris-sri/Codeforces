import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char[] t = sc.next().toCharArray();
            int lo = 0, up = 0;
            for (int i = 0; i < t.length; i++) {
                if (t[i] >= 'A' && t[i] <= 'Z') {
                    up++;
                } else if (t[i] >= 'a' && t[i] <= 'z') {
                    lo++;
                }
            }
            if (lo > up || lo == up) {
                System.out.println(output(t).toLowerCase());
            } else if (lo < up) {
                System.out.println(output(t).toUpperCase());
            }
        }
    }

    public static String output(char t[]) {
        StringBuilder sb = new StringBuilder();
        for (char c : t) {
            sb.append(c);
        }
        return sb.toString();
    }
}

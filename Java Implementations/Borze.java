import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String code = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < code.length(); i++) {
                if (code.charAt(i) == '.') {
                    sb.append(0);
                } else if (code.charAt(i) == '-' && i + 1 < code.length()) {
                    if (code.charAt(i + 1) == '.') {
                        sb.append(1);
                        i++;
                    } else if (code.charAt(i + 1) == '-') {
                        sb.append(2);
                        i++;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}

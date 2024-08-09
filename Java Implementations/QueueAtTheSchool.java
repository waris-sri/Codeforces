import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), t = sc.nextInt(), x = 0, i = 0;
            char[] s = sc.next().toCharArray();
            while (x < t) {
                if (i < n - 1) {
                    if (s[i] == 'B' && s[i + 1] == 'G') {
                        s[i] = 'G';
                        s[i + 1] = 'B';
                        i++;
                    }
                    i++;
                } else {
                    i = 0;
                    x++;
                }
            }
            System.out.println(s);
        }
    }
}

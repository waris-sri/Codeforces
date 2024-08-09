import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            System.out.println(solve(year));
        }
    }

    public static int solve(int y) {
        while (y >= 1000 && y <= 9000) {
            y++; // new year value must be larger
            if (isDistinct(y)) {
                break;
            }
        }
        return y;
    }

    public static boolean isDistinct(int y) {
        HashSet<Character> splices = new HashSet<>();
        for (char digit : String.valueOf(y).toCharArray()) {
            // return false if a digit can't be added since HashSets disallow duplicates
            if (!splices.add(digit)) {
                return false;
            }
        }
        return true;
    }
}

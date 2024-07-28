import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // a number is "nearly lucky" iff the total count of 4 and 7 equals to 4 or 7
            // e.g. 4744000695826 (luckyCount = 4)
            long n = sc.nextLong();
            char[] arr = ("" + n).toCharArray();
            int luckyCount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '4' || arr[i] == '7') {
                    luckyCount++;
                }
            }
            if (luckyCount == 4 || luckyCount == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

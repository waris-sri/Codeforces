import java.util.Scanner;
public class P1986G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] p = new int[n];
            java.util.Arrays.setAll(p, index -> sc.nextInt());
            System.out.println(count(n, p));
        }
        sc.close();
    }

    static int count(int n, int[] p) {
        int cnt = 0;
        int i = 0;
        int j = i + 1;
        while (i < n) {
            while (j < n) {
                if ((p[i] * p[j]) % ((i + 1) * (j + 1)) == 0) {
                    cnt++;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
        return cnt;
    }
}

// O(N^2)
// Time limit exceeded
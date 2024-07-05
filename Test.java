import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int n = sc.nextInt();
            long res = 0;
            List<List<Integer>> pos = new ArrayList<>();
            List<List<Integer>> val = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                pos.add(new ArrayList<>());
                val.add(new ArrayList<>());
            }
            for (int i = 1; i <= n; i++) {
                int p = sc.nextInt();
                int d = gcd(p, i);
                pos.get(p / d).add(i / d);
                val.get(i / d).add(i / d);
                if (i / d == 1) {
                    res -= 1;
                }
            }
            List<List<Integer>> fac = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                fac.add(new ArrayList<>());
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j += i) {
                    fac.get(j).add(i);
                }
            }
            int[] cnt = new int[n + 1];
            for (int p = 1; p <= n; p++) {
                if (val.get(p).isEmpty()) continue;
                for (int v = p; v <= n; v += p) {
                    for (int q : pos.get(v)) {
                        cnt[q] += 1;
                    }
                }
                for (int v : val.get(p)) {
                    for (int d : fac.get(v)) {
                        res += cnt[d];
                    }
                }
                for (int v = p; v <= n; v += p) {
                    for (int q : pos.get(v)) {
                        cnt[q] -= 1;
                    }
                }
            }
            res /= 2;
            System.out.println(res);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
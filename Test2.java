import java.util.*;
import java.io.*;

public class Test2 {
    static int N = 500020;
    static int t;
    static int n, p[];
    static int a[], b[];
    static List<Integer> vecA[], vecB[];
    static int cnt[], curr[];
    static long ans;
    static int last[], res[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();

            a = new int[n];
            b = new int[n];
            vecA = new ArrayList[N];
            vecB = new ArrayList[N];
            for (int i = 0; i <= n; i++) {
                vecA[i] = new ArrayList<>();
                vecB[i] = new ArrayList<>();
                last[i] = -1;
            }
            ans = 0;

            for (int i = 0; i < n; i++) {
                a[i] = p[i];
                b[i] = i + 1;
                int g = gcd(a[i], b[i]);
                a[i] /= g;
                b[i] /= g;
                vecA[a[i]].add(i);
                vecB[b[i]].add(i);
            }

            cnt = new int[N];
            res = new int[N];
            for (int x = 1; x <= n; x++) {
                for (int i : vecB[x]) cnt[a[i]]++;
                for (int y = x; y <= n; y += x) {
                    for (int i : vecA[y]) {
                        int val = b[i];
                        if (last[val] != x) {
                            res[val] = 0;
                            for (int j = val; j <= n; j += val) res[val] += cnt[j];
                            last[val] = x;
                        }
                        ans += res[val];
                    }
                }
                for (int i : vecB[x]) cnt[a[i]]--;
            }

            for (int i = 0; i < n; i++) if (b[i] == 1) ans--;
            ans /= 2;
            System.out.println(ans);
        }
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}


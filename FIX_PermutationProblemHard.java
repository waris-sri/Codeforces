// import java.util.Scanner;
// import java.util.Arrays;

// public class P1986G2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int len = sc.nextInt();
//         for (int i = 0; i < len; i++) {
//             int n = sc.nextInt();
//             int[] p = new int[n];
//             Arrays.setAll(p, index -> sc.nextInt());
//             System.out.println(solve(n, p));
//         }
//         sc.close();
//     }

//     /*
//      * use divisor properties and positional tracking
//      * divisibility: if m is a divisor of n, then n/m is also a divisor
//      * efficiently find divisors of a number: https://youtu.be/Pbf8tScR_fg
//      */
//     static int solve(int n, int[] p) {
//         int cnt = 0;
//         int[] last = new int[n + 1]; // track last seen positions of each number
//         Arrays.setAll(last, index -> -1); // initialize with -1 (no positions recorded yet)
//         for (int i = 0; i < n; i++) {
//             // find all divisor pairs of p[i] using square root solution
//             for (int k = 1; k * k <= p[i]; k++) {
//                 if (p[i] % k == 0) {
//                     int div1 = k, div2 = p[i] / k;
//                     // check if div1 has been previously seen && follows the key condition
//                     if (last[div1] != -1 && (p[i] * div1) % (i) == 0)
//                         cnt++;
//                     // if div2 != div1, also check with div2
//                     if (div1 != div2 && last[div2] != -1 && (p[i] * div2) % (i) == 0)
//                         cnt++;
//                 }
//             }
//             last[p[i]] = i + 1; // update the last position of p[i]
//         }
//         return cnt;
//     }
// }

// FIXME: use another code implementation that's faster than this, maybe GCD?

import java.util.Scanner;

public class FIX_PermutationProblemHard {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] p = new int[n];
                java.util.Arrays.setAll(p, index -> sc.nextInt());
                System.out.println(count(n, p));
            }
        }
    }

    static int count(int n, int[] p) {
        int cnt = 0, i = 0, j = i + 1;
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

/*
 * 6
 * 1
 * 1
 * 2
 * 1 2
 * 3
 * 2 3 1
 * 5
 * 2 4 1 3 5
 * 12
 * 8 9 7 12 1 10 6 3 2 4 11 5
 * 15
 * 1 2 4 6 8 10 12 14 3 9 15 5 7 11 13
 * -----------------------------------
 * 0 //1
 * 1 //2
 * 1 //3
 * 3 //5
 * 9 //12
 * 3 //15
 */
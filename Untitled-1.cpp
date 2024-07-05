#include <bits/stdc++.h>
using namespace std;
int main () {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int tt;
    cin >> tt;
    while (tt--) {
        int n;
        cin >> n;
        long long res = 0;
        vector<vector<int>> pos(n+1), val(n+1);
        for (int i=1; i<=n; ++i) {
            int p;
            cin >> p;
            int d = gcd(p,i);
            pos[p/d].push_back(i/d);
            val[i/d].push_back(i/d);
            if (i/d==1) {
                res -= 1;
            }
        }
        vector<vector<int>> fac(n+1);
        for (int i=1; i<=n; ++i) {
            for (int j=1; j<=n; j+=i) {
                fac[j].push_back(i);
            }
        }
        vector<int> cnt(n+1);
        for (int p=1; p<=n; ++p) {
            if (val[p].empty()) continue;
            for (int v=p; v<=n; v+=p) {
                for (int q : pos[v]) {
                    cnt[q]+=1;
                }
            }
            for (int v : val[p]) {
                for (int d : fac[v]) {
                    res+=cnt[d];
                }
            }
            for (int v=p; v<=n; v+=p) {
                for (int q : pos[v]) {
                    cnt[q]-=1;
                }
            }
        }
        res/=2;
        cout << res << '\n';
    }
    return 0;
}
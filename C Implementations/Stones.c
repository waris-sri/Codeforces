#include <stdio.h>

int main() {
  int n;
  scanf("%d", &n);
  char stones[n];
  scanf("%s", stones);
  char curr = stones[0];
  int cnt = 0;
  for (int i = 1; i < n; i++) {
    if (stones[i] != curr) {
      curr = stones[i];
    } else {
      cnt += 1;
    }
  }
  printf("%d\n", cnt);
  return 0;
}

#include <stdio.h>

int main() {
  int n, x = 0, y = 0, z = 0, sx = 0, sy = 0, sz = 0;
  scanf("%d", &n);
  while (n-- >= 1) {
    scanf("%d %d %d", &x, &y, &z);
    sx += x;
    sy += y;
    sz += z;
  }
  if (sx == 0 && sy == 0 && sz == 0)
    printf("YES\n");
  else
    printf("NO\n");

  return 0;
}

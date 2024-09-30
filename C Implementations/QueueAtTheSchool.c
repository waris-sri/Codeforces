#include <stdio.h>

int main() {
  int n, t;
  scanf("%i", &n);
  scanf("%i", &t);
  int x = 0, i = 0;
  char s[n + 1]; // +1 for null terminator (\0)
  scanf("%s", s);
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
  printf("%s", s);
  return 0;
}

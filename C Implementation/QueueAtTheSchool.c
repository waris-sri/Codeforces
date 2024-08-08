#include <stdio.h>
#include <stdlib.h>

int main() {
  int n, t;
  scanf("%i", &n);
  scanf("%i", &t);
  int x = 0;
  int i = 0;
  char s[100];
  scanf("%99s", s);
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
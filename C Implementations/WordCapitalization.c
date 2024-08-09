#include <stdio.h>

int main() {
  char t[1000];
  scanf("%*s", t);
  if (t[0] >= 'a' && t[0] <= 'z') {
    t[0] -= 32;
  }
  printf("%s", t);
}
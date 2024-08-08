#include <ctype.h>
#include <stdio.h>
#include <string.h>

int main() {
  char t[100];
  scanf("%s", t);
  int lo = 0;
  int up = 0;

  for (int i = 0; i < strlen(t); i++) {
    if (t[i] >= 'A' && t[i] <= 'Z') {
      up++;
    }
    if (t[i] >= 'a' && t[i] <= 'z') {
      lo++;
    }
  }

  if (lo >= up) {
    for (int i = 0; i < strlen(t); i++) {
      t[i] = tolower(t[i]);
    }
  } else {
    for (int i = 0; i < strlen(t); i++) {
      t[i] = toupper(t[i]);
    }
  }
  printf("%s\n", t);
  return 0;
}
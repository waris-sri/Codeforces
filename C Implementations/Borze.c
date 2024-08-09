#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  char code[200];
  char build[200] = "";
  scanf("%s", code);
  for (int i = 0; i < strlen(code); i++) {
    if (code[i] == '.') {
      strncat(build, "0", sizeof(build) - strlen(build) - 1);
    } else if (code[i] == '-' && i + 1 < strlen(code)) {
      if (code[i + 1] == '.') {
        strncat(build, "1", sizeof(build) - strlen(build) - 1);
        i++;
      } else if (code[i + 1] == '-') {
        strncat(build, "2", sizeof(build) - strlen(build) - 1);
        i++;
      }
    }
  }
  printf("%s\n", build);
  return 0;
}
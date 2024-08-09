#include <stdio.h>

int main() {
  char t[1000];
  scanf("%[^\n]", t); // scan until \n character (regex)
  if (t[0] >= 'a' && t[0] <= 'z') {
    t[0] -= 32; // turn to uppercase (95 'A' - 67 'a')
  }
  printf("%s\n", t);
}
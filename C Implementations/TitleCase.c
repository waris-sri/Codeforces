#include <stdio.h>

int main() {
  char t[1000];
  scanf("%[^\n]", t); // scan until \n character (regex)

  int i = 0, new_word = 1; // Flag to indicate the start of a new word

  while (t[i] != '\0') {
    if (new_word && t[i] >= 'a' && t[i] <= 'z') {
      t[i] -= 32; // Convert to uppercase
    }

    printf("%c", t[i]);

    if (t[i] == ' ') {
      new_word = 1; // set flag to signal for new word
    } else {
      new_word = 0; // clear flag
    }

    i++;
  }

  return 0;
}

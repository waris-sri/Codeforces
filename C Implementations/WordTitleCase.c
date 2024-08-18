#include <stdio.h>
#include <string.h>

int main()
{
  char t[1000];
  char str = scanf("%[^\n]", t); // scan until \n character (regex)
  const char delim[2] = " ";     // use " " as a delimiter, size 2 for '\n'
  char *tok;                     // prepare for tokenizer
  tok = strtok(t, delim);
  while (tok != 0)
  {
    // capitalize each token's first character'
    if (tok[0] >= 'a' && tok[0] <= 'z')
    {
      tok[0] -= 32; // turn to uppercase (95 'A' - 67 'a')
    }
    printf("%s ", tok);     // print out each token followed by a space
    tok = strtok(0, delim); // go thru other tokens
  }
  printf("\n"); // print newline at the end
  return 0;
}

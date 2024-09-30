#include <stdio.h>

int main() {
  int year;
  scanf("%d", &year);

  while (year >= 1000 && year <= 9000) {
    year++; // new year value must be larger

    int digits[10] = {0}; // digits occurrence tracker array
    int y = year;
    int distinct = 1; // 1 for true, 0 for false

    while (y > 0) {
      int digit = y % 10;
      if (digits[digit] == 1) {
        distinct = 0; // digit already seen
        break;
      }
      digits[digit] = 1; // mark the digit as seen
      y /= 10;
    }

    if (distinct) {
      break;
    }
  }

  printf("%d\n", year);
  return 0;
}

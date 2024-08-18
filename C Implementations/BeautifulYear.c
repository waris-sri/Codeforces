#include <stdbool.h>
#include <stdio.h>

bool isDistinct(int y)
{
  int digits[10] = {}; // digits occurrence tracker array
  while (y > 0)        // `y` will decrease as it's getting divided by 10
  {
    int digit = y % 10;
    if (digits[digit] == 1)
    {
      return false; // digit already seen
    }
    digits[digit] = 1; // mark as seen
    y /= 10;
  }
  return true;
}

int solve(int y)
{
  while (y >= 1000 && y <= 9000)
  {
    y++; // new year value must be larger
    if (isDistinct(y))
    {
      break;
    }
  }
  return y;
}

int main()
{
  int year;
  scanf("%d", &year);
  printf("%d\n", solve(year));
  return 0;
}

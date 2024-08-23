#include <stdio.h>

int main() {
  int presses[3][3];
  int lights[3][3];
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      lights[i][j] = 1;
    }
  }
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      int p;
      scanf("%d", &presses[i][j]);
      // skip even numbers
      if (presses[i][j] % 2 != 0) {
        // "toggle" the lights just by subtracting 1
        // check whether a position is out of bounds, if not, toggle
        lights[i][j] = 1 - lights[i][j];
        if (i - 1 >= 0)
          lights[i - 1][j] = 1 - lights[i - 1][j]; // top neighbor
        if (j - 1 >= 0)
          lights[i][j - 1] = 1 - lights[i][j - 1]; // left neighbor
        if (i + 1 < 3)
          lights[i + 1][j] = 1 - lights[i + 1][j]; // bottom neighbor
        if (j + 1 < 3)
          lights[i][j + 1] = 1 - lights[i][j + 1]; // right neighbor
      }
    }
  }
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      printf("%i", lights[i][j]);
    }
    printf("\n");
  }
  return 0;
}

// Lights Out

import java.util.Scanner;

public class LightsOut {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] presses = new int[3][3];
            int[][] lights = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    lights[i][j] = 1;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    presses[i][j] = sc.nextInt();
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
                    System.out.print(lights[i][j]);
                }
                System.out.println();
            }
        }
    }
}

// Input 1
// 1 0 0
// 0 0 0
// 0 0 1

// Output 1
// 001
// 010
// 100

// Input 2
// 1 0 1
// 8 8 8
// 2 0 3

// Output 2
// 010
// 011
// 100
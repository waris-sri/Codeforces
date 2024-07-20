import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] mat = new int[5][5];
            int mov = 0, row1 = 0, col1 = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    mat[i][j] = sc.nextInt();
                    if (mat[i][j] == 1) {
                        row1 = i + 1;
                        col1 = j + 1;
                    }
                }
            }
            mov = Math.abs(row1 - 3) + Math.abs(col1 - 3);
            System.out.println(mov);
        }
    }
}

import java.util.Scanner;

public class Stones {

  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      sc.nextLine();
      char[] stones = sc.nextLine().toCharArray();
      char curr = stones[0];
      int cnt = 0;
      for (int i = 1; i < n; i++) {
        if (stones[i] != curr) {
          curr = stones[i];
        } else {
          cnt += 1;
        }
      }
      System.out.println(cnt);
    }
  }
}
/*
- Even if all the stones have the same color, you still need to count them all.
- Convert the stones into character array for easy pointer implementation
- Set the current stone as the first one, and initialize a counter variable as 0
- If the current stone isn't `curr`, set it to `curr` to move through the array
- Else, increase the count (`cnt` = the minimum number of stones to take from the table)
*/

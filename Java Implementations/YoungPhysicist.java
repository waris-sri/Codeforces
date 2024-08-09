import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt(), x = 0, y = 0, z = 0, sx = 0, sy = 0, sz = 0;
            while (n-- >= 1) {
                sx += x + sc.nextInt();
                sy += y + sc.nextInt();
                sz += z + sc.nextInt();
            }
            if (sx == 0 && sy == 0 && sz == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
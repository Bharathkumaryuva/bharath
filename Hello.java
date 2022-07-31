import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int ans = 0;
        int num;
        num = a.nextInt();
        for (int i = 1; i <= 10; i++) {
            ans = num * i;
            System.out.println(num + "X" + i + "=" + ans);
        }

        int y = 0;
        int num2;
        num2 = a.nextInt();
        int ans2;
        do {
            ans2 = num2 * y;
            y++;
            System.out.println(num2 + "X" + y + "=" + ans2);
        } while (y <= 15);
    }
}
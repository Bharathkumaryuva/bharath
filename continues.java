import java.util.Scanner;

public class continues {
    public static void main(String args[]) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi-" + i);
            if (i == 4) {
                System.out.println("Hi from if");

            }
            System.out.println(i);
            continue;
        }
    }
}
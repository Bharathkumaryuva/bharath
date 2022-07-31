import java.util.Scanner;

class facto {

    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int d;
        int c = 1;
        d = a.nextInt();

        for (int b = 2; b <= d; b++) {
            c = c * b;
            System.out.println(c);
        }

    }
}
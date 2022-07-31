import java.util.Scanner;

public class switcher {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int a;
        System.out.println("Enter any value between 1-7:");
        a = S.nextInt();

        switch (a) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter number with 1-7:");

        }
        char old;
        char new1;

        old = S.next().charAt(0);
        new1 = Character.toLowerCase(old);
        switch (new1) {
            case 'a':
                System.out.println("Monday");

                break;

            default:
                System.out.println("Enter form A-Z");
        }
        String o;
        String n;

        o = S.next();
        n = o.toLowerCase();
        switch (n) {
            case "a":
                System.out.println("Monday");

                break;
            case "b":
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Enter form A-Z");
        }
    }
}
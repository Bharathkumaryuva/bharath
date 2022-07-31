import java.util.Scanner;

class dynamicarry {
    public static void main(String args[]) {

        int a = 1;
        int[] myarray1 = new int[6];
        System.out.println(myarray1.length);

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < myarray1.length; i++) {
            myarray1[i] = s.nextInt();
        }

        System.out.println(myarray1.length);
        System.out.println(myarray1[0]);
        System.out.println(myarray1[1]);
        System.out.println(myarray1[2]);
        System.out.println(myarray1[3]);
        System.out.println(myarray1[4]);
        System.out.println(myarray1[5]);

        for (int i = 0; i < myarray1.length; i++) {
            System.out.println(myarray1[i]);

        }
        // shortcut
        for (int i : myarray1) {
            System.out.println(i);

        }
        // shortcut
        for (int i = 0; i < myarray1.length; i++) {
            System.out.println("The element is " + myarray1[i]);
            a++;

        }

        for (int i = 0; i < myarray1.length; i++) {

            if (myarray1[i] % 2 == 0) {
                System.out.println(myarray1[i] + " is even ");
            } else {
                System.out.println(myarray1[i] + " is odd ");
            }
        }
    }
}
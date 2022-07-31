class arr {
    public static void main(String args[]) {

        int a = 1;

        int[] myarray = { 11, 23, 43, 91, 66 };
        System.out.println(myarray.length);
        System.out.println(myarray[0]);
        System.out.println(myarray[1]);
        System.out.println(myarray[2]);
        System.out.println(myarray[3]);
        System.out.println(myarray[4]);

        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i]);

        }
        // shortcut
        for (int i : myarray) {
            System.out.println(i);

        }
        // shortcut
        for (int i = 0; i < myarray.length; i++) {
            System.out.println("The element is " + myarray[i]);
            a++;

        }
    }
}
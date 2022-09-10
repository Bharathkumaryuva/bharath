public class A {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println("Hello");
        int i = 10;
        //Arithmetic unchecked excecution
        try {

            i = i / 5;
            System.out.println(i);
        }
        catch(ArithmeticException a){
            System.out.println("Divide by zero problem");
        }
        finally {
            System.out.println("cleaning done");
        }
        try {
            arr[1] = 25;
        }
        catch(ArrayIndexOutOfBoundsException z){
            System.out.println("cant access the index ahead of size");
        }
        finally {
            System.out.println("2nd cleaning done");
        }
        System.out.println("wORLD");
    }
}

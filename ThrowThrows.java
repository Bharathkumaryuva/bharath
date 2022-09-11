public class ThrowThrows {
    public static void main(String[] args)  throws ArithmeticException,ArrayIndexOutOfBoundsException{
        try {
            System.out.println("HI");
            throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            System.out.println("inside catch");
        }
    }
}

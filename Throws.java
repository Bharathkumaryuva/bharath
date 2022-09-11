public class Throws {

        public static void main(String[] args)  {
            int i=5;
            int[]arr ={1,2,3};
            try {
                i=i/0;
                arr[4]=51;
                throw new ArrayIndexOutOfBoundsException();
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound error");
            }
            catch(ArithmeticException e){
                System.out.println("AE error");
            }
        }
    }



public class Excption{
    public static void main(String[] args) {
        try{
        String s = null;
        System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("NUll pointer excption");
        }
        try{
            String s = "abc";
            int i = Integer.parseInt(s);
        }
        catch(NumberFormatException r){
              System.out.println("NumberFormatException");
        }
        try{
            int a[] = new int[5];
            a[10] = 50;
        }
        catch(ArrayIndexOutOfBoundsException t){
                  System.out.println("ArrayIndexOfBoundException");
        }

    }
    public class Example{
        
        public void incorrectCastExample(){
            Long value = 1967L;
            String name = (String) value;
        }

    }
}

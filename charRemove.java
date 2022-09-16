public class charRemove{
    public static void main(String[] args) {
        String in ="abcdTRDG123";
        System.out.println("String after removing a =" + in.replace("a",""));
        System.out.println("string after removing first ab = " + in.replace("ab",""));
        System.out.println("string after rmoving first small letter = " + in.replaceAll("([a-z])",""));
      
    }
}
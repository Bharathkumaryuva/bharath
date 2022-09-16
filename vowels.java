import java.util.Scanner;

public class vowels{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the String");
        String in = a.nextLine();

       String v1 = in.replaceAll("[aeiou]","");
       System.out.println("Removing vowels : " +v1);
        
    }
}
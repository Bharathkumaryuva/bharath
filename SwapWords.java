import java.util.Scanner;

public class SwapWords{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first word");
        String a = s.nextLine();
        System.out.println("Enter the second word");
        String b = s.nextLine();
        
        System.out.println("Before swap " +a+ " " +b);
        a = a+b;

        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("After swap " +a+ " " + b);
    }
}
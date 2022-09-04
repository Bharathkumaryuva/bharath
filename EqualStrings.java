import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter first String ");
        String s1 = s.next();
        System.out.println("Enter the second String ");
        String s2 = s.next();

        if((s1.toLowerCase()).equals(s2.toLowerCase()))
        {
            System.out.println("Both strings are equal");
        }
        else
        {
            System.out.println("Both strings are different");
        }
    }
}

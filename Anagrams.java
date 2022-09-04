import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter first word");
        String s1 = s.nextLine();
        System.out.println("Enter second word");
        String s2 = s.nextLine();
        if(s1.length()!=s2.length())
        {
            System.out.println("Enter strings with equal length");
        }
        else {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            String s3 = c1.toString();
            String s4 = c2.toString();


            if (s3.equals(s4)) {
                System.out.println("They are Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
    }
}

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word");
        String s1 = s.nextLine();
        char[] c1 = s1.toCharArray();
        for(int i = s1.length()-1; i>=0; i--){
            System.out.print(c1[i]);
        }
    }
}

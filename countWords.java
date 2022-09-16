import java.util.Scanner;

public class countWords{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the words");
        String b = a.nextLine();

       String words[] = b.split(" ");
        System.out.println("Number of words : " + words.length);
    }
}
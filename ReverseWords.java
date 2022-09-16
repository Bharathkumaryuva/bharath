import java.util.Scanner;
public class ReverseWords{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String a = s.nextLine();

        String b[] = a.split(" ");

        String ans = " ";
        for(int i = b.length-1;i>=0;i--){
            ans += b[i]+" ";
        }

            System.out.println("Reversed String : ");
            System.out.println(ans.substring(0, ans.length()-1));
        

    }
}
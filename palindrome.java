import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
       String str,rev = "";
       Scanner f = new Scanner(System.in);
       System.out.println("Enter the string");
       str = f.nextLine();
       int length = str.length();
       
       for(int i = length-1 ; i>=0;i--)
          rev=rev+str.charAt(i);
          if(str.equals(rev))
            System.out.println(str+ " Its a palindrom");
          
          else
            System.out.println(str+ " Its not a palindrom");
        

       
    }
}
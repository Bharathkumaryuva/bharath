import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class vowels {
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        System.out.print("enter a character");
         //String letter=S.nextLine();
        //String letter2=letter.toUpperCase();
        char letter = S.nextLine().charAt(0);
        char letter2=Character.toUpperCase(letter);
        String letter3=Character.toString(letter2);
        if(letter3.equals("A")||letter3.equals("E")||letter3.equals("I")||
        letter3.equals("O")||letter3.equals("U"))
        {
         System.out.println("The Letter is Vowel:"+letter);
        }
        else 
        {
            System.out.println("The letter: "+letter+" is consonent:");
        }
    }
}

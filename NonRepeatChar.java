import java.util.Scanner;

public class NonRepeatChar{
    public static void main(String[] args) {
          Scanner a = new Scanner(System.in);
        System.out.println("Enter the word");
        String Word = a.nextLine();

        for(char i : Word.toCharArray()){
            if(Word.indexOf(i)== Word.lastIndexOf(i)){
                System.out.println("Non-repating character : " +i);
                break;
            }
        }
    }
}
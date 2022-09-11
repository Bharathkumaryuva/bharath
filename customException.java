import java.sql.SQLOutput;
import java.util.Scanner;

public class customException extends Exception{
    public static  void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i = s1.nextInt();
        try{
            if(i>18){
                System.out.println("eligible to vote");
            }
            else if (i<=17 && i>=0) {
                System.out.println("not eligible to vote");
            }
            else if (i<0) {
                throw new customException();
            }
        }
        catch(customException ex){
            System.out.println("Dont enter negative value");
        }
    }
}

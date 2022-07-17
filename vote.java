import java.util.Scanner;

public class vote {
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        int num = s.nextInt();
        if(num>0)
        {
            System.out.println("person eligible to vote");
        }
        else 
        {
            System.out.println("person not eligible to vote");
        }
    }
    
}

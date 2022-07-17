import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class number{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        int num = s.nextInt();
        if(num>0)
        {
            System.out.println("number is positive");
        }
        else if(num==0)
        {
            System.out.println("number is nutrual");
        }
        else{
            System.out.println("number is negative"); 
        }
    }
    
}
 
    


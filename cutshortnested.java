 import java.util.Scanner;

public class cutshortnested {
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        System.out.println("enter height of person in cms");
        double height=S.nextDouble();
        System.out.println("enter 12th score in percentage");
        double percentage=S.nextDouble(); 
        if (height>=160 && percentage>=60)
        {
            System.out.println("congrats,he is eligible");
        }
        else
        {
            if(height<160 && percentage<60)
            {
                System.out.println("height & percentage is less");
            }
            else if(height<160 || percentage<60);
            {
                System.out.println("sorry,your criteria is not eligible");  
            }
        }
    }
}

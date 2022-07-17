import java.util.Scanner;

public class nested {
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        System.out.println("enter height of person in cms");
        double height=S.nextDouble();
        System.out.println("enter 12th score in percentage");
        double percentage=S.nextDouble();
        if(height>=160)
        {
            if(percentage>=60)
            {
                System.out.println("congrats,he is eligible to go to army");
            }
            else 
            {
                System.out.println("sorry,he has to score more than 60% to be eligible");  
            }

        }
        else if(height<160)
        {
            if (percentage<60)
        System.out.println("sorry,he is not eligible to army");
        else
        {
            System.out.println("height & percentage is not eligible");
        }
        }    
}
}
package a;
import b.vegitable;

import java.util.Scanner;

public class fruit {
   String name,color;
   int Seeds;

   public fruit(){
       name = "Apple" ; color = "Red" ; Seeds =4 ;
       System.out.println("The fruit " +name+ " is " + color +" in color has Seeds " + Seeds);

   }
   fruit(int s, String n, String c){
       this.Seeds = s;
       this.name = n;
       this.color = c;
       System.out.println("The fruit " +this.name+ " is " + this.color +" in color has Seeds " +this.Seeds);

   }
   String display(String Bn){
       System.out.println("The Bn of the fruit " + this.name + " is " + Bn);
       return Bn;
   }

    public static void main(String[] args) {

       String b;
       String na,co;
       int se;
       Scanner a = new Scanner(System.in);
       System.out.println(" Type the fruit name ");
       na = a.nextLine();
       System.out.println(" Type the Botanical name ");
       b = a.nextLine();
       System.out.println("Type the color");
       co =a.nextLine();
       System.out.println("Type the number of seeds");
       se = a.nextInt();
       fruit f = new fruit();
       fruit f1 = new fruit(se,na,co);
       f1.display(b);

       vegitable v = new vegitable();
        System.out.println(v.display("jsdfhhsf"));
    }

}

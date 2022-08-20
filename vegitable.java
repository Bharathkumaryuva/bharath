package b;
import a.fruit;
import java.util.Scanner;

public class vegitable {

    String name,color;

    public vegitable(){
        name = "carrot" ; color = "orange";
        System.out.println("The vegitable " + name + " is " + color );
    }
    vegitable(String n, String c){

        this.name = n;
        this.color = c;
        System.out.println("The vegitable " + this.name + " is " + this.color );

    }
    public String display(String Bn){
        System.out.println("The Bn of the vegitable " + this.name + " is " + Bn);
        return Bn;
    }

    public static void main(String[] args) {

        String b;
        String na,co;
        Scanner e = new Scanner(System.in);
        System.out.println(" Type The vegitable name");
        na = e.nextLine();
        System.out.println(" Type The Botanical name");
        b = e.nextLine();
        System.out.println(" Type The color");
        co = e.nextLine();

        vegitable v = new vegitable();
        vegitable v1 = new vegitable(na,co);
        v1.display(b);

        fruit f =new fruit();
        System.out.println(f);

    }

}

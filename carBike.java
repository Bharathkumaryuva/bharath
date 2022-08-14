
import A.bike;
public class carBike{

    String color,type,model;
    int seat;
carBike(){
    color ="red";type = "saden";model ="suzuki";seat = 4;
    System.out.println("hi how are you");
}

carBike(int s,String c,String t,String m){
    this.color =c;
     this.type = t; 
     this.model = m; 
     this.seat = s;
}
    void travel() {

        System.out.println("Hi I am a "+type+" car of model "+model+" In color "+color);
            
        }
        
    

        public static void main(String[] args)  {
        
            
            carBike c = new carBike(); //constructor call
            System.out.println(c.color);
            System.out.println(c.type);
            System.out.println(c.model);
            System.out.println(c.seat);
            c.travel();

            bike b = new bike();//constructor call
            System.out.println(b);
            
            
            

            

    }
    

}

  

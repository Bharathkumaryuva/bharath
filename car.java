class car{

    String color,type,model;
    int seat;
car(){
    color ="red";type = "saden";model ="suzuki";seat = 4;
}
car(int s,String c,String t,String m){
    this.color =c;
     this.type = t; 
     this.model = m; 
     this.seat = s;
}
    void travel() {

        System.out.println("Hi I am a "+type+" car of model "+model+" In color "+color);
            
        }

        public static void main(String[] args)  {

            car c = new car();
            System.out.println(c.color);
            System.out.println(c.type);
            System.out.println(c.model);
            System.out.println(c.seat);
            c.travel();

            car c1 = new car(6,"blue","hachbag","hyundai");
            System.out.println(c1.color);
            System.out.println(c1.type);
            System.out.println(c1.model);
            System.out.println(c1.seat);
            c1.travel();


            
        }

    }



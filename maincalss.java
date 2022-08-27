class parent{
    void display(String a){
        System.out.println("dispaly" + a);
    }
    void write(){
        System.out.println("Hi from parent write()");
    }
}

class child extends parent{
    void display(){
        System.out.println("Hi from child");
    }
    void write(){
        System.out.println("Hi from child");
        super.write();
    }
}
class maincalss{
    public static void main(String arr[]){
     child c = new child();
     c.display();
     c.display("Naga ");
     c.write();
     parent p = new parent();
     p.write();  
    }
}
class parent1{
    void write(){
        System.out.println("Hi from parent write()");
    }
}

class child1 extends parent1{
    void write(){
        System.out.println("Hi from child");
        super.write();//how to call parent write() using child object? 
                      //by using super keyword
     }
}
class maincalss2{
    public static void main(String arr[]){
        child1 c = new child1();
        c.write();
        parent1 p = new parent1(); //how to call child write fn. using parent object?
        p.write();                //by using upcasting keyword
        parent1 p1 = new child1();//upcasting - access child items using parents 
        p1.write();  
        child1 c1 = new parent1();//is downcast method possible in java,
        c1.write();               //not directly but we normally use inheritance to(extends)
       }                          //access parent thru child   
   }
    

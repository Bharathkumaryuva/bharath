package BE;

abstract class Message{
    public Message() {
        System.out.println("Hi from Default const");

    }
   
    abstract void send();
    abstract void recieve();
    public void display(){
        System.out.println("Hi from normal method inside abstract class ");
        
    }
}
class communication extends Message{
    void send(){
        System.out.println("Hi from send inpce inside child ");
         }
    void recieve(){
          System.out.println("Hi from recieve from child ");  
        }
}
class Abstract{
    public static void main(String[] args) {
        Message m = new communication();
        m.send();
        m.recieve();
        m.display();
    }
}
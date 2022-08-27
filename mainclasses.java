class parents{
    String b = "ball";
    parents(){
        System.out.println("Hi from parent called by super");
    }
    void display(String a){
        System.out.println(b);
        System.out.println("name is " + a + " from parent");
    }
}
class childs extends parents{
    childs(){
        super();        //should be written first
        System.out.println("Hi from child cons");
    }
      void display(String a){
        System.out.println("name is " + a + " from child class");
        super.b = "Harini";
        super.display("Hasini");
      }
}
class mainclasses{
    public static void main(String[] args) {
       childs c = new childs();
       c.display("Naga"); 
    }
}
interface E{       // marker interface

}
interface A{            //functional interface
    String str ="hello";
    void show();
} 
interface B extends A{     //extends interface      
    void hide();
}
class C implements E,B{
    public void show(){
        System.out.println("Implemented show in child ");
    }
    public void hide(){
        System.out.println("Implemented hide in child");
    }
}
interface F{          //nested interface
    void display();
    interface G{
        void write();
    }
}
class D{
    public static void main(String[] args) {
        C c = new C();
        A ca = new C();
        B cb = new C();
        c.show();
        c.hide();
        System.out.println(c.str);
    }
}
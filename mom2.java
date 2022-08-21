package b;

public class mom2 {
    void happy(){
        System.out.println("I am happy");
    }
}
class dad{
    void angry(){
        System.out.println("I am angry");
    }
}
class son extends mom,dad{
    public static void main(String[] args) {
        son s = new son();
        s.happy();
        s.angry();
    }
}

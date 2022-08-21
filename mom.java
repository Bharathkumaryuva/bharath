package b;
class parents{
    void sad(){
        System.out.println("we are sad");
    }
}

class Brother1 extends parents{
    void angry(){
        System.out.println("Bro1");
    }
}
class Brother2 extends parents{
    void happy(){
        System.out.println("Bro2");
    }
}
class mom{
    public static void main(String[] args) {
        Brother2 b2 = new Brother2();
        Brother1 b1 = new Brother1();
        b2.happy();
        b2.sad();
        b1.angry();
        b1.sad();

    }
}
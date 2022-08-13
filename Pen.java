class Pen {
int width;
String type,color;

    Pen(int w, String t, String c){
        this.width = w;
        this.type = t;
       this.color = c;
    }

    public Pen() {
        
    width = 10;
    type = "Ball point"; color = "Blue";
    }

    void write() {
        System.out.println("Hi I am a Pen");

    }

    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println(p.width);
        System.out.println(p.type);
        System.out.println(p.color);
        p.write();

        Pen p1 = new Pen();
        System.out.println(p1.width);
        System.out.println(p1.type);
        System.out.println(p1.color);
        p.write();

        Pen p2 = new Pen(13,"jel","Black");
        System.out.println(p2.width);
        System.out.println(p2.type);
        System.out.println(p2.color);
        p2.write();

        Pen p3 = new Pen(15,"ink","green");
        System.out.println(p3.width);
        System.out.println(p3.type);
        System.out.println(p3.color);
        p3.write();
    }

}
public class outer {
    private int i = 50;

     class Inner {
        public void to()

        {
            System.out.println(i);
        }
    }


    public  void main(String[] args) {

        outer.Inner o = new Inner();
        o. to ();
        Inner in1 = new Inner();
        in1.to();

    }
}

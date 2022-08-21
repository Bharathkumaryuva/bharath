package b;

public class grandfather {
    String gname(){
        return  "Murugesan";

    }
}
class parent extends grandfather{
    String pname(){
        return  "Anandhan";
    }
}
class son extends parent{
    public static void main(String[] args) {
        son s = new son();
        System.out.println(s.pname());
        System.out.println(s.gname());
    }
}

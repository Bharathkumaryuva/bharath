import java.io.*;

class Serialization{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("objects.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        String s = new String("hello");
        oos.writeObject(s);//ser-obj-hello-->stream
        oos.flush();

        FileInputStream fis = new FileInputStream("objects.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String data = (String) ois.readObject();//deser- stream--obj object.ser--> data object
        System.out.println(data);
    }
}

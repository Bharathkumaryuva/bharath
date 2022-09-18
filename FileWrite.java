import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("new.txt");
        fw.write("hello from code");
        fw.close();
        FileReader fr = new FileReader("fileA.txt");
        int i = 0;
        while ((i = fr.read())!=-1){
            System.out.print((char)(i));
        }
        fr.close();

    }
}

import java.io.*;

public class FileOperationA {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("fileA.txt");
        OutputStream os = new FileOutputStream("fileB.txt");
        int i = 0;
        System.out.println("The files of Ready");
        while((i = is.read())!= -1){
            os.write(i);
        }
        is.close();
        os.close();
        System.out.println("The contents copied from text file 1 to file 2");
    }
}

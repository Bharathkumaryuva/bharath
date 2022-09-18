import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("BEe.png");
            if (f.createNewFile()) {
                System.out.println("New file created " + f.getName());
            }
            else {
                System.out.println("File already exits");
            }
        }
        catch (IOException e) {
        }
    }
}
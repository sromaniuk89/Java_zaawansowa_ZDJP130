import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JavaPathTest {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaNIOTest.txt";

        Path path = Paths.get(filePath);
        try{
            Files.createFile(path);
            Files.write(path, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

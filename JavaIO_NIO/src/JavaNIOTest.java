import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

public class JavaNIOTest {
    public static void main(String[] args) {
        //zakladam ze ten plik już istnieje
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaIOTest.txt";

        //W ponizszych przykladach korzystamy z idei buforów i kanałów

        //odczyt
        try(FileInputStream fileInputStream = new FileInputStream(filePath)){
            FileChannel fileChannel = fileInputStream.getChannel(); //kanał tworzymy ze strumienia wej/wyj
            ByteBuffer byteBuffer = ByteBuffer.allocate(20);

            fileChannel.read(byteBuffer);

            //System.out.println("Data read from the file: " + Arrays.toString(byteBuffer.array()));

            byteBuffer.rewind();//jezeli chcemy rozpoczac odczytywanie od poczatku nalezy przewinac nasz bufor
            while(byteBuffer.remaining()>0){
//                System.out.print((char)byteBuffer.get());
                System.out.print(byteBuffer.getChar());
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)){
            FileChannel fileChannel = fileOutputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(30);

            String string = "SDA:JAVA";
            for(int i=0; i<string.length(); i++){
                byteBuffer.putChar(string.charAt(i));
            }

            //przy wykonywania czynności odczytu/zapisu automatycznie przesuwa się znacznik pozycji
            //wiec jeśli chcemy zapisywać do pliku od początku buforu, ten znacnzik musimy przewinać
            byteBuffer.rewind();
            fileChannel.write(byteBuffer);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

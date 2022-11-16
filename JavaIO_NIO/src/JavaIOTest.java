import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.Collectors;

public class JavaIOTest {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sławomir\\Desktop\\SDA\\Nowy program\\Java - zaawansowana\\JavaIO_NIO\\JavaIOTest.txt";


//        try(warunki poczatkowe){
//            tutaj co chcemy zrobic
//        } catch (co lapiemy (jaki wyjatek)){
//            co w razie wystapienia wyjatku robimy
//        } finally { (finally jest opcjonalne)
//            co ma sie zawsze wykonac na koniec dzialania bloku
//        }

        File file = new File(filePath); //tworzony jest nowy obiektu File zwiazany z dana sciezka,
        //natomiast nie tworzy to pliku (jeszcze!)

        //utworzenie pliku jezeli on jeszcze nie istnieje
        try{
            if(file.createNewFile()){
                System.out.println("File created.");
            } else {
                System.out.println("File already existed.");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        //zapis do pliku
        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.append('q');
            fileWriter.write("asdf\n");
            fileWriter.write("zxcv");
            System.out.println("Text written to file.");
        } catch (Exception e){
            e.printStackTrace();
        }

        //odczyt z pliku
        try(FileReader fileReader = new FileReader(filePath)){
            int nextChar;
            while((nextChar=fileReader.read())!=-1){
                System.out.println((char)nextChar);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        //odczyt z pliku za pomoca buforowanego strumienia
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String inputString = bufferedReader.lines().collect(Collectors.joining("\n"));
            System.out.println(inputString);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

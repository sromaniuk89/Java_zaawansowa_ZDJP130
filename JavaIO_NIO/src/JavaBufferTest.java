import java.nio.CharBuffer;
import java.util.Arrays;

public class JavaBufferTest {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(12); //
        String string = "SDA:JAVA";

        for (int i =0; i<string.length(); i++){
            charBuffer.put(string.charAt(i));
        }

        //odczyt calego bufora przy uzyciu metody array()
        System.out.println("Text in CharBuffer: " + Arrays.toString(charBuffer.array()));

        System.out.println(charBuffer.get(0));//tu powinno byc S
        System.out.println((int)charBuffer.get(11));

        //inny sposob na odczyt, przy uzyciu metody get()
        String dataFromCharBuffer="";
        charBuffer.rewind();
        while(charBuffer.remaining()>0){
            System.out.println("Inside while");
            dataFromCharBuffer += charBuffer.get(); //metoda get() pobiera nam znak i sama przechodzi na nastepna pozycje
        }
        System.out.println("Utilization of get() method: " + dataFromCharBuffer);
    }
}

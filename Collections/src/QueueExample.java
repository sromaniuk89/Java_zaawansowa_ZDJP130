import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add("one"); //jeżeli kolejka jest pełna, rzuci wyjątek
        kolejka.offer("two"); //nie rzuci wyjątku, a jedynie zwróci false
        String string = kolejka.remove(); //jeżeli kolejka jest pusta, rzuci wyjątek, pobieramy element
        System.out.println(string);

        string = kolejka.poll(); //jeżeli kolejka jest pusta, zwróci null, pobieramy element
        System.out.println(string);

        kolejka.offer("three");
        string = kolejka.element(); //jeżeli kolejka jest pusta, rzuci wyjątek, odczytujemy wartosc (bez pobierania)
        System.out.println(string);

        string = kolejka.peek(); //jeżeli kolejka jest pusta, zwróci null, odczytujemy wartosc (bez pobierania)
        System.out.println(string);

        //kolejka.poll(); //
        int iloscElementow = kolejka.size();
        System.out.println(iloscElementow);
    }
}

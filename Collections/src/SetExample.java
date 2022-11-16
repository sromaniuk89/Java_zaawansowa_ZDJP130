import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        //typy generyczne nie moge byc parametryzowane typami prymitywnymi
        //zarazem nie mozna utworzyc kolekcji typu int!
        //Set<int> intSet = new HashSet<>();

        Set<Double> doubleSet = new HashSet<>();

        doubleSet.add(3.14);
        doubleSet.add(1.4);
        doubleSet.add(8.1);
        doubleSet.add(1.4); //dodajemy taka sama wartosc co sie stanie???
        doubleSet.add(1.6);
        doubleSet.add(1.0);
        doubleSet.add(3.723);

        //w zbiorze moga znajdowac sie tylko elementy unikalne, wiec
        //przed dodaniem nowego elementu sprawdzane jest czy taki sam element juz w zbiorze sie nie znajduje
        System.out.println(doubleSet);

    }
}

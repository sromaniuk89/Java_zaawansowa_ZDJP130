import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> favouriteColors = new HashMap<>();

        favouriteColors.put("John", "Red");
        favouriteColors.put("Jack", "Blue");

        System.out.println(favouriteColors.get("Jack"));
        System.out.println(favouriteColors.containsKey("John"));
        System.out.println(favouriteColors.containsKey("Rudolf"));

        //najpierw pobieramy zbiór wpisów z mapy używajac metody entrySet()
        //następnie pobieramy poszczególne wpisy używając typu Map.Entry<>
        for (Map.Entry<String, String> entry : favouriteColors.entrySet()) {
            System.out.print(entry.getKey() + ": "); //pobranie klucza z wpisu
            System.out.println(entry.getValue()); //pobranie wartosci z wpisu
        }

        System.out.println(favouriteColors);
    }
}

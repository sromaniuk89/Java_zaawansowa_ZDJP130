import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer val1 = 34;

        //metoda of()
        //podstawowa metoda do opakowania obiektu
        Optional<Integer> optionalInteger = Optional.of(val1);

        //opakowujac nulla metoda of() zostanie rzuczony wyjatek
        //Optional<Integer> optionalInteger2 = Optional.of(null);

        //metoda ofNullable()
        Optional<String> stringOptional = Optional.ofNullable(null);
        Optional<String> stringOptional2 = Optional.ofNullable("test123");

        //tworzenie pustego optionala
        //np. gdy nie znajdziemy tego co szukamy w kolekcji to zwracamy pustego optionala
        Optional<Double> emptyDoubleOptional = Optional.empty();

        System.out.println(optionalInteger.isPresent());
        System.out.println(stringOptional.isPresent()); //gdy opakowany jest null to zwroci false
        System.out.println(emptyDoubleOptional.isPresent()); //gdy optional jest pusty zwroci false

        //utworzenie pustego optionala
        Optional<String> stringOptional3 = Optional.empty();

        printText(stringOptional2);
        printText(stringOptional3);

        //metoda orElseThrow rzuca wyjatek gdy optional jest pusty
        System.out.println(stringOptional3.orElseThrow(()-> new RuntimeException("I have thrown this exception")));
    }

    //metoda ta bedzie wyswietlac z gory ustalony tekst gdy optional jest pusty
    public static void printText(Optional<String> strOpt){
        System.out.println(strOpt.orElse("<empty optional>"));
    }
}

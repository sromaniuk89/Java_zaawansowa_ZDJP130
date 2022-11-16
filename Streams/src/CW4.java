import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class CW4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ala", "kot", "samochód", "aleksandra", "pies", "azor");

        //a
        stringList.stream().forEach(s->System.out.println(s));
        //b
        stringList.stream().forEach(System.out::println);

        //zrobmy lambde ktora bedzie generowac liste stringow
        //po to zebysmy nie musieli meczyc sie z wymyslaniem wyrazow
        Supplier<List<String>> generateStringList = () -> {
            List<String> list = new LinkedList<>(); //na poczatku tworzymy pusta liste Stringow
            for(int i=0; i<50; i++){
                String s =""; //tworzymy pusty String
                Random rnd = new Random();

                int rndVal=rnd.nextInt(7);
                for(int j=0; j<rndVal+2; j++){ //kazdy wyraz bedzie mogl sie skladac z roznej liczby znakow
                    //w tablicy ASCII od 65 do 90 sa wielkie litery
                    //wiec zrobimy tak, ze bedziemy losowac wartosci w przedziale 65-90 a nastepnie rzutowac je na char
                    //po czym dodawac do Stringa
                    s+=(char)(rnd.nextInt(90-65+1)+65);
                }

                list.add(s.toLowerCase());
            }
            return list;
        };

        System.out.println(generateStringList.get());

        generateStringList.get().stream().forEach(System.out::println);

        //wyswietlamy dlugosc wyrazow
        generateStringList.get().stream().map(s->s.length()).forEach(System.out::println);

    }
}

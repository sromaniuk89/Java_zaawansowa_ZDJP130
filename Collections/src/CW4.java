import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CW4 {
    public static void main(String[] args) {

        //tworzymy liste w ktorej beda zapisywane wylosowane liczby
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int[] range = new int[2]; //Przechowuje zakres
        Random rnd = new Random(); //obiekt typu Random

        //Pobranie dlugosci listy od uzytkownika
        System.out.println("Give number of Random Numbers:");
        int n = scanner.nextInt();

        //Pobranie zakresu losowanych liczb od uzytkownika
        System.out.println("Give min value");
        range[0]=scanner.nextInt(); //pobranie wartosci minimalnej
        System.out.println("Give max value");
        range[1]=scanner.nextInt(); //pobranie wartosci maksymalnej

        for(int i=0; i<n; i++){
            //losowanie z roznicy przedzialow powiekszone o 1
            //nastepnie dodaje wartosc minimalna celem dopasowania
            //do pozadanego przedzialu
            //przyklad: od 2 do 6 ->roznica to: 6-2=4
            //metoda nextInt(int bound) -> losuje liczby w zakresie od 0 do bound-1
            //czyli nextInt(4) -> da nam liczby w zakresie 0;1;2;3
            //wiec jesli chcemy miec liczby w zakresie 0;1;2;3;4 to musimy wstawic nextInt(5), dlatego do roznicy
            //z pozadanego zakresu losowanych liczb dodajemy 1
            //gdy juz mamy liczby w zakresie <0; 4> to wystarczy dodac 2 i uzyskujemy liczby w zakresie <2; 6>
            list.add(rnd.nextInt(range[1]-range[0]+1)+range[0]);
        }

        System.out.println(list);
    }
}


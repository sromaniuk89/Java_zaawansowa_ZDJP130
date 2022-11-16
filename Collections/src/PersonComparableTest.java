import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PersonComparableTest {
    public static void main(String[] args) {
        Person[] persons=new Person[6];
        persons[0]=new Person("Zbigniew","Czartoryjski",55);
        persons[1]=new Person("Zuzia","Nowak",19);
        persons[2]=new Person("Jan","Kowalski",23);
        persons[3]=new Person("Ola","Niemen",3);
        persons[4]=new Person("Bartosz","Nowak",28);
        persons[5]=new Person("Bartosz","Nowak",21);

        //tutaj utworzymy sobie liste z tablicy:
        List<Person> personList = new LinkedList<>(Arrays.asList(persons));
        System.out.println(personList); //wyswietlamy zawartosc listy

        Collections.sort(personList); //wykonujemy sortowanie listy
        Collections.sort(personList,Collections.reverseOrder()); //wykonujemy sortowanie listy od najwiekszych do najmn.
        System.out.println(personList); //wyswietlamy zawartosc listy po posortowaniu

        Arrays.sort(persons); //sortowanie tablicy

        for(Person p:persons){ //wyswietlamy zawartosc tablicy w petli foreach
            System.out.println(p);
        }
    }
}

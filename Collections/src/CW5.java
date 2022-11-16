import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CW5 {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(new Integer[]{1, 1, 1});
        List<Integer> listB = Arrays.asList(new Integer[]{2, 2, 2, 2, 2});

        List<Integer> res = listAddition(listB, listA);

        System.out.println(res);
    }

    public static List<Integer> listAddition(List<Integer> a, List<Integer> b){
        //lista wynikowa (rezultat sumowania)
        List<Integer> res= new LinkedList<>();

        if(a.size()>b.size()){ //tutaj gdy lista a jest dluzsza
            for(int i=0; i<a.size(); i++){ //iteruje po dlugosci listy dluzszej (a)
                if(i<b.size()){ //sprawdzam czy caly czas jestem w rozmiarze listy b
                    res.add(a.get(i)+b.get(i)); //sumuje elementy z obu list
                }
                else{
                    res.add(a.get(i)); //przypisuje tylko element z listy dluzszej
                }
            }
        }
        else{//tutaj gdy lista a nie jest dluzsza
            for(int i=0; i<b.size(); i++){ //iteruje po dlugosci listy dluzszej (b)
                if(i<a.size()){ //sprawdzam czy caly czas jestem w rozmiarze listy a
                    res.add(a.get(i)+b.get(i)); //sumuje elementy z obu list
                }
                else{
                    res.add(b.get(i)); //przypisuje tylko element z listy dluzszej
                }
            }
        }

        return res;
    }
}
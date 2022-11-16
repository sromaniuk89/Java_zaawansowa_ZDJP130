import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //cecha charakterystyczna drzewa jest to, ze jego elementy sa automatycznie posortowanie
        //oraz oczywiscie drzewo podobnie jak zbior moze zawierac jedynie elementy unikatowe
        Integer[] nums={1,6,3,7,9,5};
        SortedSet<Integer> tree=new TreeSet<>(Arrays.asList(nums));

        System.out.println(tree.first());
        System.out.println(tree.last());

        //1 nie zostanie dodane do drzewa
        System.out.println(tree.add(1)); //metoda add bedzie zwracac informacje czy dany element zostal dodany

        //11 nie bylo wiec zostanie dodana
        System.out.println(tree.add(11));
        printAll(tree);

        printAll(tree.headSet(7));//wyswietlamy wszystko do wartosci 7

    }

    public static void printAll(SortedSet<Integer> tree){
        for(Integer s: tree){
            System.out.println(s);
        }
        System.out.println();
    }
}

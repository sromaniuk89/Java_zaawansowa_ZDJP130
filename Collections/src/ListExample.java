import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> listWithNames = new LinkedList<>();

        listWithNames.add("John");
        listWithNames.add("Jack");
        listWithNames.add("Adam");

        for(String name: listWithNames){
            System.out.println(name);
        }

        //wykonuje sortowanie
        listWithNames.sort(String::compareTo);

        System.out.println(listWithNames);
    }
}

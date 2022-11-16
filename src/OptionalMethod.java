import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalMethod {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();

        integerList.add(2);
//        integerList.add(7);
        integerList.add(12);

        //System.out.println(3*findOdd(integerList));
        System.out.println(3*findOddOptional(integerList).orElse(-1));
    }

    //jak to dalo sie zrobic bez Optionala (moze powodowac NullPointerException)
    private static Integer findOdd(List<Integer> list){
        for(int integer:list){
            if(integer%2==1)
                return integer;
        }

        return null;
    }

    //to samo z uzyciem Optionala (zapobiega NullPointerException)
    private static Optional<Integer> findOddOptional(List<Integer> list){
        Optional<Integer> optionalInteger = Optional.empty();
        for(int integer:list){
            if(integer%2==1) {
                optionalInteger = Optional.of(integer); //opakowujemy to co znalezlismy w optionala
                return optionalInteger;
            }
        }

        return optionalInteger;
    }
}

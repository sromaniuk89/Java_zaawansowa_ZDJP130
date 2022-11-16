import java.util.function.IntSupplier;

public class LambdaTest {
    public interface Checker<T> {
        boolean check(T object);
    }

    public static void main(String[] args) {
        int n=3;

        Checker<Integer> integerChecker = x -> x%2!=0;
        System.out.println(integerChecker.check(22));
        method1(integerChecker);

        Object object1 = new Object();
        IntSupplier object1HashCode = () -> object1.hashCode();

        Object object2 = new Object();
        //przez :: mowimy jaka metoda ma zostac zastosowana - robimy wskazanie ta jakas metode
        IntSupplier object2HashCode = object2::hashCode; //operator :: dziala jak referencja na metode
        //IntSupplier object2HashCode2 = object2.hashCode(); //to nie zadziala!!!, bo zwroci inta a nie instancje IntSupplier

        System.out.println(object1HashCode.getAsInt());
        System.out.println(object2HashCode.getAsInt());

    }

    //method1 przyjmuje jako argument metode
    //realizujemy to przez podanie nazwy interfejsu funkcyjnego jako typu przyjmowanego parametru
    public static void method1(Checker<Integer> checker){
        //nastepnie wewnatrz metody korzystamy z tego parametru jak z metody

        System.out.println(checker.check(23));
        System.out.println(checker.check(22));
    }
}

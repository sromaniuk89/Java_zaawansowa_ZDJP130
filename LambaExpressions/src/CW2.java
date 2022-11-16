import java.util.function.UnaryOperator;

public class CW2 {
    public static void main(String[] args) {
        //wyrazenie lambda zamieniajace tekst na wielkie litery
        UnaryOperator<String> operator = x -> x.toUpperCase();
        System.out.println(operator.apply(("karol")));

        //zrealizowanie tego samego poprzez odwolanie sie do metody
        UnaryOperator<String> operator2 = String::toUpperCase;
        System.out.println(operator2.apply("abc"));
    }
}
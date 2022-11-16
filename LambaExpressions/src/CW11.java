import java.util.function.Function;

public class CW11 {
    public static void main(String[] args) {
        Function<Character, Integer> asciiCharToInt = x -> (int)x;
        Function<Integer, Character> asciiIntToChar = x -> (char)x.intValue();

        System.out.println(asciiCharToInt.apply('a'));
        System.out.println(asciiIntToChar.apply(70));

    }
}

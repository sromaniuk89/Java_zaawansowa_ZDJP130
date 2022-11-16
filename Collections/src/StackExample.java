import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(22);
        stack.add(333);

        //System.out.println(stack.push(1));
        stack.push(4444);
        //System.out.println(stack.peek());
        System.out.println(stack.peek()); //metoda peek zwraca wartosc ze stosu, ale jej nie pobiera
        System.out.println(stack.pop());    //metoda pop pobiera wartosc ze stosu
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.get(1));
    }
}

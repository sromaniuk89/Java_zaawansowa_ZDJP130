public class InnerClassTest {
    public static void main(String[] args) {
        OuterClassA outerClassA = new OuterClassA(); //obiekt klasy zewnetrznej

        //klase wewnetrzna (non-static) tworzymy z poziomu obiektu klasy zewnetrznej!!!
        OuterClassA.InnerClassA innerClassA = outerClassA.new InnerClassA();

        //klase zagniezdzona statyczna mozemy utworzyc bezposrednio z poziomu klasy zewnetrznej!
        OuterClassA.NestedClassA nestedClassA = new OuterClassA.NestedClassA();

        System.out.println(outerClassA.num1);
        System.out.println(innerClassA.num3);
        System.out.println(nestedClassA.num2);

        //klasy wewnetrzne (non-static) maja dostep do pol i metod klasy okalajacej
        innerClassA.printNum1();
    }
}

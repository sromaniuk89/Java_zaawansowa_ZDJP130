public class ClassD extends AbstractClassB {

    //implementacja metody z klasy AbstractClassB
    @Override
    public void printNumber() {
        System.out.println("D:4");
    }

    //implementacja metody z klasy AbstractClassA
    @Override
    public void printSymbols() {
        System.out.println("D@@@@@@");
    }

    @Override
    public void printText() {
        System.out.println("Text from ClassD");
    }
}

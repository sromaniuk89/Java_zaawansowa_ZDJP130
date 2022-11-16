public class AbstractClassTest {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        //AbstractClassA classA = new AbstractClassA(); //<- nie mozemy zrobic instancji klasy abstrakcyjnej!!!
        AbstractClassA classAC = new ClassC();

        classAC.printSymbols();
        classC.printSymbols();

        AbstractClassA classAD = new ClassD();
        AbstractClassB classBD = new ClassD();

        classAD.printSymbols();
        classAD.printText();
        //classAD.printNumber(); //w AbstractClassA nie ma takiej metody

        classBD.printNumber();
        classBD.printSymbols();
        classBD.printText();
    }
}

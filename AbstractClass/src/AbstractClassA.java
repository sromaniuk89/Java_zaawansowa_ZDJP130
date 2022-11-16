public abstract class AbstractClassA { //klasa abstrakcyjna
    public static final int num = 123;

    public abstract void printSymbols(); //metoda abstrakcyjna

    //w klasie abstrakcyjnej mozemy posiadac implementacje -> czyli mozemy miec zwykle metody z cialem!
    public void printText(){
        System.out.println("Text from AbstractClassA");
    }
}

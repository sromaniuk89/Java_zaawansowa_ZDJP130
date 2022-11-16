public interface IMathOperations {
    public double add(double a, double b);
    public double subtract(double a, double b);
    public double multiply(double a, double b);
    public double divide(double a, double b);

    //teraz dodam metode domyslna
    default void printAvailableMethods(){
        System.out.println("add,subtract,multiply,divide");
    }

    //metoda prywatna (dostepne od JAVA 9+)
    //metody prywatne ze wzgledu na swoja istote moga byc jedynie uzywane w metodach domyslnych danego interfejsu
//    private int getNumberOfMethods(){
//        return 4;
//    }
}

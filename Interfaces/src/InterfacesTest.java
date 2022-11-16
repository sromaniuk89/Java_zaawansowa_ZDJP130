public class InterfacesTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(2.0,3.0); //nie musze przechwytywac tego co zwraca metoda
        double r = calculator.add(2.0,3.0);
        calculator.displayResult();

        calculator.printAvailableMethods();
    }
}

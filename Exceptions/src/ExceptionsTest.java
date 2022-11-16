import java.io.IOException;

public class ExceptionsTest {
    public static void main(String[] args) {
        IOOperations ioOperations = new IOOperations();

        try {
            ioOperations.readDataFromFile();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Test");

        //wyjatkow unchecked nie trzeba obslugiwac, ale jesli tego nie zrobimy to nasza aplikacja sie po prostu zatrzyma
        //ioOperations.makeCalculations();

        try{
            ioOperations.makeCalculations();
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Will this be printed?");

        method1();

        ioOperations.divideNumbers(3.0, 4.0);
        ioOperations.divideNumbers(3.0, 0.0);

    }

    public static void method1(){
        method2();
    }

    public static void method2(){
        method3();
    }

    public static void method3(){
        method4();
    }

    public static void method4(){
        IOOperations ioOperations = new IOOperations();
        try{
            ioOperations.makeCalculations();
        } catch (RuntimeException e){
            e.printStackTrace();
        } finally {
            System.out.println("This will always execute");
        }
    }
}

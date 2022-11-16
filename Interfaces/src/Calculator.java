//klasa może implementować wiele interfejsów
public class Calculator implements IDisplayFunctions, IMathOperations {
    private double result;

    @Override
    public void displayResult() {
        System.out.println(result);
    }

    @Override
    public double add(double a, double b) {
        result=a+b;
        return result;
    }

    @Override
    public double subtract(double a, double b) {
        this.result=a-b;
        return result;
    }

    @Override
    public double multiply(double a, double b) {
        result=a*b;
        return result;
    }

    @Override
    public double divide(double a, double b) {
        if(b!=0.0){
            result=a/b;
        }else {
            result=0.0;
        }
        return result;
    }
}

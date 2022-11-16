public class Calculator implements ICalculator<Number> {

    //implementuje metode z interfejsu
    @Override
    public  Number add(Number a, Number b){
        return a.doubleValue() + b.doubleValue();
    }

    @Override
    public Number subtract(Number a, Number b){
        return a.doubleValue()-b.doubleValue();
    }

    @Override
    public Number multiply(Number a, Number b){
        return a.doubleValue()*b.doubleValue();
    }

    @Override
    public Number divide(Number a, Number b){
        return a.doubleValue()/b.doubleValue();
    }

}

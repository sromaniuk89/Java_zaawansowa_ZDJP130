import java.io.IOException;

public class IOOperations implements AutoCloseable{

    //throws - informuje jakie wyjatki moga zostac rzucone, oraz spycha odpowiedzialnosc za ich obsluge na nizszy poziom
    public void readDataFromFile() throws IOException{
        throw new IOException(); //przyklad wyjatku checked - czyli musi byc obsluzony
    }

    public void makeCalculations(){
        throw new RuntimeException(); //przyklad wyjatku unchecked - czyli nie musi byc obsluzony
    }

    public void divideNumbers(double a, double b){
        if(b==0.0)
        throw new DividingByZeroException("You are trying to divide" + a + " by " + b);

    }

    @Override
    public void close() throws Exception {

    }
}

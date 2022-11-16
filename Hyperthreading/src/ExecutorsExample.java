import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //Interfejs callable sprawia ze mozemy z metody zwrocic wartosc generyczna
        //A Future represents the result of an asynchronous computation.
        // Methods are provided to check if the computation is complete, to wait for its completion,
        // and to retrieve the result of the computation. The result can only be retrieved using
        // method get when the computation has completed, blocking if necessary until it is ready.
        Future future = executorService.submit(new ClassCallable()); //submit gdy cos zwraca

        try {
            System.out.println(future.get());
        } catch (Exception e){
            e.printStackTrace();
        }

        executorService.shutdown();//shutdown zamyka serwis wykonawcy, uzywamy

        //ta metoda utworzymy stricte okreslona pule watkow
        ExecutorService executorService2 = Executors.newFixedThreadPool(5);

        //execute gdy nie potrzebujemy nic zwracac
        for(int i=0;i<10;i++)
            executorService2.execute(new ClassRunnable());

        executorService2.shutdown();

    }
}

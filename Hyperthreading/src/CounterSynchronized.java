public class CounterSynchronized {
    private static int counter = 0;
    private static final Object lock = new Object(); //posluzy nam do synchronizacji

    public void incrementCounter(){
        synchronized (lock) {//synchronized musi byc uzyty na obiekcie, dlatego nie zastosujemy tego do typow prostych
            counter++;
            System.out.println(Thread.currentThread().getName() + " : " + counter);
        }
    }

    public static int getCounter(){
        return counter;
    }
}

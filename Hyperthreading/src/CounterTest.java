public class CounterTest {
    public static void main(String[] args) {
//        CounterThread counterThread1 = new CounterThread();
//        counterThread1.setName("counter1");
//        counterThread1.start();
//        CounterThread counterThread2 = new CounterThread();
//        counterThread2.setName("counter2");
//        counterThread2.start();
//        CounterThread counterThread3 = new CounterThread();
//        counterThread3.setName("counter3");
//        counterThread3.start();

        for(int i=0; i<3; i++){
            CounterSynchronizedThread counterSynchronizedThread = new CounterSynchronizedThread();
            counterSynchronizedThread.setName("counterSynchronized"+i);
            counterSynchronizedThread.start();
        }

        for(int i=0; i<3; i++){
            CounterAtomicThread counterAtomicThread = new CounterAtomicThread();
            counterAtomicThread.setName("counterAtomic"+i);
            counterAtomicThread.start();
        }

    }
}

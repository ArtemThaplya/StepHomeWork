package homeWork_25_26_Multitreading_1;

public class ChengeCounter implements Runnable {
    private long counter;

    long getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (long i = 0; i < 1_000_000_000; i++) {
            counter++;
        }
    }
}

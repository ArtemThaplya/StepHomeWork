package homeWork_25_26_Multitreading_1;

public class ComparisonOfEstates <T> {
    private ChengeCounter chengeCounter = new ChengeCounter();

    void createTHread() throws InterruptedException {
        Thread thread1 = new Thread(chengeCounter);
        thread1.setPriority(3);
        thread1.start();
        Thread.sleep(3000);
        comparisonCounter(thread1, chengeCounter);

        Thread thread2 = new Thread(chengeCounter);
        thread1.setPriority(2);
        thread2.start();
        comparisonCounter(thread2, chengeCounter);

        Thread thread3 = new Thread(chengeCounter);
        thread1.setPriority(4);
        thread3.start();
        comparisonCounter(thread3, chengeCounter);

        Thread thread4 = new Thread(chengeCounter);
        thread1.setPriority(1);
        thread4.start();
        comparisonCounter(thread4, chengeCounter);

        Thread thread5 = new Thread(chengeCounter);
        thread1.setPriority(4);
        thread5.start();
        comparisonCounter(thread5, chengeCounter);
    }

    private void comparisonCounter(Thread thread, ChengeCounter counter){
        System.out.println(Thread.currentThread().getName()
                + Thread.currentThread().getId()
                + "  " + counter.getCounter());
    }
}

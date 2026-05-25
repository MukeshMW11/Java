package starter;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            counter.increment();
        }
    }

    // public static void main(String[] args) {
    // Counter counter = new Counter();
    // MyThread thread1 = new MyThread(counter);
    // MyThread thread2 = new MyThread(counter);
    // thread1.start();
    // thread2.start();

    // try {
    // thread1.join();
    // thread2.join();
    // } catch (Exception e) {
    // // TODO: handle exception
    // }

    // System.out.println("The count value is " + counter.getCount());

    // }

    // public static void main(String[] args) {
    // Counter counter = new Counter();
    // Thread thread1 = Thread.startVirtualThread(() -> {
    // for (int i = 0; i < 10000000; i++) {
    // counter.increment();
    // }
    // });

    // Thread thread2 = Thread.startVirtualThread(() -> {
    // for (int i = 0; i < 10000000; i++) {
    // counter.increment();
    // }
    // });

    // try {
    // thread1.join();
    // thread2.join();
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // System.out.println("The count value is " + counter.getCount());

    // }

    public static void main(String[] args) {
        Counter counter = new Counter();
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            executor.submit(() -> {
                for (int i = 0; i < 10000000; i++) {
                    counter.increment();
                }
            });
            executor.submit(() -> {
                for (int i = 0; i < 5000000; i++) {
                    counter.increment();
                }
            });
        }
        System.out.println("The count value is " + counter.getCount());

    }
}

class Counter {
    // private int count = 0;
    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();

    }

    public int getCount() {
        return count.get();
    }
}

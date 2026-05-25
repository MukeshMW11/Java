package starter;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(100);
        car1.setName("Toyota");
        car1.drive();
        PolyLoader();
        PolyOverriding();
        TestIntface t1 = new TestIntface();
        t1.makeCall();
        TestThreads();

    };

    public static void PolyLoader() {
        Poly pol = new Poly();
        pol.add(1, 2);
        pol.add('a', 'b');
    }

    public static void PolyOverriding() {
        Parent p = new Child();
        p.hello();
    };

    public static void TestThreads() {
        long startTime = System.currentTimeMillis();
        // System.out.println("The thread name is " + Thread.currentThread().getName());
        MultiThreading multi = new MultiThreading();
        MultiThreadingAnother multiAnother = new MultiThreadingAnother();
        Thread anotherThread = new Thread(multiAnother);
        multi.start();
        anotherThread.start();

        try {
            multi.join();
            anotherThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Time Taken " + (System.currentTimeMillis() - startTime) + " ms");
    }

}

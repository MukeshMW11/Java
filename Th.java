// class A extends Thread {

//     public void run() {

//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hi " + Thread.currentThread().getName());
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello " + Thread.currentThread().getName());
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class Th {

//     public static void main(String[] args) {

//         A a = new A();
//         B b = new B();

//         // System.out.println(a.getPriority());
//         // a.setPriority(Thread.MAX_PRIORITY);
//         // System.out.println(a.getPriority());

//         a.start();
//         b.start();

//     }

// }

// @FunctionalInterface
// interface A extends Runnable {

// }

// @FunctionalInterface

// interface B extends Runnable {

// }

// public class Th {

// public static void main(String[] args) {

// Runnable a = () -> {

// for (int i = 0; i < 5; i++) {
// System.out.println("Hi " + Thread.currentThread().getName());
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// };

// Runnable b = () -> {
// for (int i = 0; i < 5; i++) {
// System.out.println("Hi " + Thread.currentThread().getName());
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// };

// // System.out.println(a.getPriority());
// // a.setPriority(Thread.MAX_PRIORITY);
// // System.out.println(a.getPriority());

// Thread t1 = new Thread(a);
// Thread t2 = new Thread(b);
// try {

// t1.join();
// t2.join();
// } catch (InterruptedException e) {
// System.out.println(e);
// }

// t1.start();
// t2.start();

// // a.run();
// // b.run();

// }

// }

class Counter {
    public int count;

    public synchronized void increment() {
        count++;
    }
}

public class Th {

    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable a = () -> {

            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable b = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        // System.out.println(a.getPriority());
        // a.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(a.getPriority());

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(c.count);
        // a.run();
        // b.run();

    }

}

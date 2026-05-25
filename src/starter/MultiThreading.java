package starter;

// public class MultiThreading {
//     public void run() {
//         int count = 0;
//         for (int i = 0; i < 500; i++) {
//             count++;
//         }
//         System.out.println("This is the thread 2 with count " + count);
//     }
// }

// class MultiThreadingAnother {
//     public void run() {
//         int count = 0;
//         for (int i = 0; i < 1000; i++) {
//             count++;
//         }
//         System.out.println("This is the thread 2 with count " + count);
//     }
// }

public class MultiThreading extends Thread {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 500; i++) {
            count++;
        }
        System.out.println("This is the thread 2 with count " + count);
    }
}

class MultiThreadingAnother implements Runnable {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            count++;
        }
        System.out.println("This is the thread 2 with count " + count);
    }
}
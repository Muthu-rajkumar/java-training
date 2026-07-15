package DAY14.CLASSTASK;


public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t1 = new Thread(mt);  // now uses java.lang.Thread
        t1.start();
    }
}

class MyThread1 implements Runnable {
    public void run() {
        System.out.println("Second thread running: " + Thread.currentThread().getName());
    }
}

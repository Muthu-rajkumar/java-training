package DAY15.CLASSTASK;

public class Synchronize {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.balance = 800;

        GpayAccount g1 = new GpayAccount(b1);
        PhonePe p1 = new PhonePe(b1);

        g1.start();  // start thread
        p1.start();  // start thread

        try {
            g1.join();  // wait for g1 to finish
            p1.join();  // wait for p1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + b1.balance);
    }
}

class GpayAccount extends Thread {
    BankAccount b;

    GpayAccount(BankAccount bankAcc) {
        System.out.println("GPay Account created");
        this.b = bankAcc;
    }

    @Override
    public void run() {
        b.withdraw(500);
        System.out.println("GPay withdrew 500");
    }
}

class PhonePe extends Thread {
    BankAccount b;

    PhonePe(BankAccount bankAcc) {
        System.out.println("PhonePe Account created");
        this.b = bankAcc;
    }

    @Override
    public void run() {
        b.withdraw(300);
        System.out.println("PhonePe withdrew 300");
    }
}

class BankAccount {
    String name;
    int balance;

    synchronized void withdraw(int amount) {
        balance = balance - amount;
    }
}


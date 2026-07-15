package DAY14.HOMETASK;

class Chef extends Thread {
    public void run() {
        System.out.println(getName() + " : Preparing food orders");
        System.out.println(getName() + " : Making Noodles");
        System.out.println(getName() + " : Making Fried Rice");
    }
}

class Waiter extends Thread {
    public void run() {
        System.out.println(getName() + " : Serving Table 1");
        System.out.println(getName() + " : Serving Table 2");
    }
}

class Cashier extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " : Generating Bill for Table 1");
        System.out.println(getName() + " : Collecting Payment");
        System.out.println(getName() + " : Printing Receipt");
    }
}

public class Resturant {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Cashier cashier = new Cashier();

        chef.setName("Chef Thread");
        waiter.setName("Waiter Thread");
        cashier.setName("Cashier Thread");

        chef.start();
        waiter.start();
        cashier.start();
    }
}
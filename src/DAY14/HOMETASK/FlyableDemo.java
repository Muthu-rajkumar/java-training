package DAY14.HOMETASK;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flapping wings");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is engaging engines");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {
        Flyable[] flyingObjects = { new Bird(), new Airplane() };
        for (Flyable obj : flyingObjects) {
            obj.fly();
        }
    }
}

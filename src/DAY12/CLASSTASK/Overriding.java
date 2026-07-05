package DAY12.CLASSTASK;

public class Overriding {
    void start() {
        System.out.println("Car Started");
    }
}  class SportsCar extends Overriding {
    void start() {
        System.out.println("Sports Car Started");
    }
}
class Main {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.start();
    }
}

package DAY12.CLASSTASK;

public class Constructor {

    Constructor() {
        System.out.println("Car Constructor");
    }
}

class SportsCarConstructor extends Constructor {

    SportsCarConstructor() {
        System.out.println("SportsCar Constructor");
    }
}

class CarConstructorTest {

    public static void main(String[] args) {
        SportsCarConstructor car = new SportsCarConstructor();
    }
}
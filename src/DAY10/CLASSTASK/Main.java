package DAY10.CLASSTASK;

 class Car {
        String brand;
        String model;
        String colour;
        public void drive() {
            System.out.println("Driving !!!" + colour + " " + brand + " " + model);
        }
    }
    public class Main {
        public static void main(String[] args) {
            Car c1 = new Car();
            c1.brand = "BMW";
            c1.model = "X6";
            c1.colour = "BLACK";
            c1.drive();
        }
    }



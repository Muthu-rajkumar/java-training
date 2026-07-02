package DAY10.CLASSTASK.HOMETASK;


class Laptop {
    String brand;
    String model;
    int ram;
    int memory;
    Laptop(String brand, String model, int ram, int memory) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.memory = memory;
    }
    void installApp(String appName) {
        ram--;
        System.out.println(appName + " is installed in " + brand + " " + model
                + " ram available : " + ram);
    }
}
class Main {
    public static void main(String[] args) {
        Laptop ms = new Laptop("Lenovo", "12", 8, 256);
        for (int i = 1; i <= 5; i++) {
            ms.installApp("Brave");
        }
    }
}

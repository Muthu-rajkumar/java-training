package DAY14.CLASSTASK;

public class Interface {

    public static void main(String [] args){
        C c1 = new C();
        c1.run();
    }
}
class A{
    void run(){
        System.out.println("A is running");
    }
}

interface B{
    void run();
}

class C extends A implements B{
    public void run(){
        System.out.println(" c is running");
    }
}

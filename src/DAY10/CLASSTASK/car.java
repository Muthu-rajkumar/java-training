package DAY10.CLASSTASK;

public class car {
    String Brand;
    String Model;
    String Colour;
    int speed=30;
    int maxspeed=40;

    public void Accelerete(){
        if(speed<40){
            speed=speed+5;
            System.out.println("car moving at speed: "+speed+"km speed ");
        }
        else{
            System.out.println("car reached ,maximum speed!!!");
        }

    }
    public void Brake(){
        if(speed==0){
            System.out.println("car not moving");
        }
        else if(speed>0){
            speed=speed-5;
            System.out.println("car breaking speed "+speed);
        }

    }
    public static void main(String[]args){
        car c1=new car();
        car c2=new car();
        car c3=new car();

        c1.Brand="bmw";
        c1.Model="m5";
        c1.Colour="Black";
        System.out.println(" c1 brand :" + c1.Brand);
        System.out.println(" c1 model "+ c1.Model);
        System.out.println(" c1 colour "+c1.Colour);
        c1.Accelerete();
        c1.Accelerete();
        c1.Accelerete();
        c1.Accelerete();
        c1.Accelerete();
        c1.Accelerete();
        c1.Accelerete();
        c1.Accelerete();
        c1.Accelerete();
        c1.Brake();

        c2.Brand="BMW";
        c2.Model="X9";
        c2.Colour="wine red";
        System.out.println(" c2 brand :" + c2.Brand);
        System.out.println(" c2 model "+ c2.Model);
        System.out.println(" c2 colour "+c2.Colour);
        c2.Brake();
    }
}

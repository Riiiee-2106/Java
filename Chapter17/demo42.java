package Chapter17;


//abstract class
public class demo42 {

    public static void main(String[] args) {
        Car c = new Electric();
        c.start();
        c.accelerate();
        c.brake();
    }
    
}


abstract class Car{
    void start(){

        System.out.println("car has started");
    }

    abstract void accelerate();


    abstract void brake();
}


class FuelCar extends Car{
    @Override 
     void accelerate(){
        System.out.println("fuel car accelerates");
    }

    @Override 
    void brake(){
        System.out.println("fuel car applied brake");
    }
}


class Electric extends Car{
    @Override 
    void accelerate(){
        System.out.println("electric car accelerates");
    }

    @Override 
    void brake(){
        System.out.println("electric car applied brake");
    }
}
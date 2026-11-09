package lecture17.abstractionAndPolymorphism;

public class demo45 {

    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
        
    }
    
}


abstract class Car{
    void start(){
        System.out.println("car started");
    }

    abstract void accelerate();

    abstract  void brake();
}


class ElectricCar extends Car{

    @Override
    void accelerate(){
        System.out.println("electric car accelerated");

    }

    @Override
    void brake(){
         System.out.println("electric car applied brake");
    }
}

class FuelCar extends Car{

    @Override
    void accelerate(){
         System.out.println("fuel car accelerated ");

    }

    @Override
    void brake(){
          System.out.println("fuel car applied brake");
        
    }
}
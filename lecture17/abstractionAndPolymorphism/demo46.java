package lecture17.abstractionAndPolymorphism;

public class demo46 {

    public static void main(String[] args) {

        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
        
    }
    
}

interface Car{

    void start();

    void accelerate();

    void brake();
}

class FuelCar implements Car{

    @Override
    public void start(){
        System.out.println("starting fuel car");

    }


    public  void accelerate(){
        System.out.println("fuel car is accelerating");
        
    }

    public void brake(){
        System.out.println("fuel car applied brake");
        
    }

}


class ElectricCar implements Car{

    public void start(){
        System.out.println("starting the electric car");
    }

    public void accelerate(){
        System.out.println("electric car is accelerating");
    }

    public void brake(){
        System.out.println("electric car applied brake");
    }
    
}
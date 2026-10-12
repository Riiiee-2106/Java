package Chapter17;

public class demo43{

    public public static void main(String[] args) {
        Car c = new FuelCar();
        c.start();
        c.accelerate();
        c.brake();

        
    }
}


//interface methods are by default public -- so the child class cannot narrow down its visibility ,you can just extend its visibility thats why all the child inherited methods should be public
interface Car{
    void start();
    void accelerate();
    void brake();
}



class FuelCar implements Car{

    @Override
    public void start(){

        System.out.println("fuel car has started");
    }

     @Override
    public void accelerate(){
        System.out.println("fuel car has accelerated");
    }
    


     @Override
    public void brake(){
        System.out.println("fuel car applied brake");

    }
    
}


class ElectricCar implements Car{

    @Override
    public void start(){
        System.out.println("electric car has started");
    }

     @Override
    public void accelerate(){
        System.out.println("electric car has accelerated");
    }
    


     @Override
    public void brake(){
        System.out.println("electric car applied brake");
    }
    
    

}
package lec17;

public class demo41 {


    public static void main(String[] args) {

        // abstraction --->using interfaces

        Car c = new ElecticCar();
        c.start();
        c.accelerate();
        c.brake();


        
    }
    
}


interface Car{

    void start();

    void accelerate();

    void brake();
}





class FuelCar implements Car{ //concrete class


    // by default you have to write public before methods --- as of now just understand that interfaces are public -- can be accessed from anywhere, so you cannot narrow down its visibility

    @Override
    public void start(){
        System.out.println("fuel car is starting");
    }

      @Override
  public void accelerate(){

        System.out.println("fuel car is accelerating");
    }


      @Override
   public void brake(){
        System.out.println("fuel car applied brake");

    }
}



class ElecticCar implements Car{ //concrete class


      @Override
     public void start(){
        System.out.println("Electric car is starting");
    }

      @Override
   public void accelerate(){
        System.out.println("Electric car is accelerating");

    }

      @Override
    public void brake(){
        System.out.println("Electric car applied brake");
    }

}
package lec17;

public class demo40 {

    // abstraction  --- using abstract class

    public static void main(String[] args) {
        Car c = new ElecticCar();
        c.start();
        c.accelerate();
        c.brake();

        Car c1 = new FuelCar();
        c1.start();
        c1.accelerate();
        c1.brake();
    }
    
}



abstract class Car{ //declaring some methods and declaring and defining others
    void start(){
        System.out.println("starting the car");
    }


abstract void accelerate();



abstract void brake();

}


class FuelCar extends Car{  //concrete class

    void accelerate(){

        System.out.println("fuel car is accelerating");
    }

    void brake(){
        System.out.println("fuel car applied brake");

    }
}

class ElecticCar extends Car{ //concrete class

    void accelerate(){
        System.out.println("Electric car is accelerating");

    }

    void brake(){

        System.out.println("Electric car applied brake");
    }

}
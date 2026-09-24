package Chapter24;

public class demo74 {

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();

        Vehicle.brake();
        
    }
    
}


//after  java 8 

interface Vehicle{
    /*by default all methods before java 8 were --  public abstract void drive();*/

    // but after java 8 we have default interface methods
    default void drive(){
        System.out.println("vehicle drive");
        accelerate();
    }


    // there are list interfaces - arraylist , linkedlist , java wanted to introduce new methods in these list, what if we just have declared this, so if we try to implement these interfaces we need to define it and override it , it can create fuss
    // so we have default methods in interfaces
    // we can also override it - but there is no neccessity around this
    
    // now we have default method as well as static methods

    static void brake(){
        System.out.println("vehicle is appling break");
    }

    // from java 9 - there can also be private methods

    private void accelerate(){

    }

    // any other method of this class can call it, not from outside

}

class Car implements  Vehicle{

    // when child class implement parent function - it shadows it
   
   /*  @Override 
    public void drive(){
        System.out.println("car is driving");
    }*/
}

import javax.sound.sampled.SourceDataLine;

public class demo77{
    public static void main(String[] args) {
        
        //after java8 what are the changes happened in interfaces

        Vehicle v = new Car();
        v.drive();

      Vehicle.brake();
      Vehicle v2 = new Car();
      v2.drive();

    }
}

interface Vehicle{
    // void drive();

    //after java 8 we can give definition to interface methods using default methods

    default void drive(){
        System.out.println("vehicle is driving");
        accelerate(); //so even if it is not inherited and defined by inherited class ,still it wont give error
    }

    //after java8 - why default methods? as we have list interface , java wanted to introduce new methods , if java would have introduced new methods directly - then if java had declared new methods  , then where ever this list interface is implemented it needs to be overriden otherwise it would be not working  -- that  is why java bought - default methods and static methods as well

    static void brake(){
        System.out.println("vehicle is applying brake");
    }


//from java 9 we can also have privatemethods
private void accelerate(){
    System.out.println("vehicle is accelerating");
}


}

class Car implements Vehicle{
  /*  @Override
    public void drive(){
        System.out.println("car is driving");
    }*/
}
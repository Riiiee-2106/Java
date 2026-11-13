
import javax.sound.sampled.SourceDataLine;

public class demo73{
    public static void main(String[] args) {

        Car c = new BlackThar();
        c.drive();
        


    }
}


//uses polymorphism for dynamic dispatch

interface Car{
    void drive(); //by default public - accessible to everyone
}

 abstract class Thar implements  Car{
   /* @Override
    public void drive(){ //by default - default - accessible inside a package - so we need to pass public in it , base class access modiefier cannot be narrow down we can just extend it
        System.out.println("thar is driving");
    }*/

   abstract public  void drive();
}


class BlackThar extends Thar{
    @Override
    public void drive(){ //by default - default - accessible inside a package - so we need to pass public in it , base class access modiefier cannot be narrow down we can just extend it
        System.out.println("black thar is driving");
    }

}


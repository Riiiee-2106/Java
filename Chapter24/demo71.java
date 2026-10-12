package Chapter24;

public class demo71 {

    public static void main(String[] args) {
        
        Car c = new BlackThar() ;
            c.drive();
        
            Payment p = new CreditCard();
            p.pay(); //dynamically we can change the code


            // interfaces and abstract class provide frame in springboot
    }
    
}


interface Car{
    void drive(); //by default public  -- base class rule can be extended but not narrowed down
}


/*class Thar implements  Car{
    @Override 
    public void drive(){  //if public access modifier is not passed drive will get default access modifier which is accessed only with in the package , so we cant narrow down functions visibility

        System.out.println("thar is driving");


    }*/


abstract class Thar implements  Car{
   abstract public void drive();
}


class BlackThar extends  Thar{
    @Override 
    public void drive(){
        System.out.println("black thar is driving");
    }
}


// interface make a very good use of polymorphism - which is dynamic dispatch

interface Payment{
    void pay();
}

class CreditCard implements Payment{

    @Override
    public void pay(){
        System.out.println("paying via credit card");
    }
}

class DebitCard implements Payment{
    @Override 
    public void pay(){
        System.out.println("paying via debit card");
    }
}
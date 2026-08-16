public class demo61{
    public static void main(String[] args) {

        // Car c = new Thar();
        // c.drive();


        // dynamically change -- 
        Payment p = new DebitCard();
        p.pay();
        

    }
}

interface Car{   //by default drive is public
     void drive();
}

// class Thar implements Car{   -- what if it is not implementing car
    
    //thar is child of car -- as public can be accessed from anywhere  and if no access modifier is passed in drive override -- then it will by default add default method ---which can be accessed only in same package ,
    // so this is ouximoric as, how parent class can be accessed from everywhere but not its class child.
    // therefore we add public in child overridden methods as well
    
    
    // @Override
    // public void drive(){
    //     System.out.println("thar is driving");

    // }

abstract class Thar implements Car{
        abstract public void drive();
    }

class BlackThar extends Thar{
    @Override
    public void drive(){
        System.out.println("black thar drives");
    }
}


// interface gives benefit of dynamic dispatch -- polymorphism

interface Payment{
    void pay();
}

class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("paying via Credit card");
    }
}

class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("paying via Debit card");
    }
}
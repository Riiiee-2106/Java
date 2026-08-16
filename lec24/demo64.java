public class demo64 {
    

    public static void main(String[] args) {
        Vehicle.setGear();
    }
}



// after java8 lot of changes in interfaces

interface Vehicle{
    // we can have default methods
    // so there is no need to override it
    default void start(){

    }

     static void setGear(){

    }
}

class Car implements Vehicle{
    @Override
    public void start(){ 
        // if overridden then overshadows parent class method

    }

    // @Override
    // public void setGear(){
    //     System.out.println();
    // }
}

// but why defaut methodss

// list is java -- wanted to introduce method -- if it only declared methods 
// so whenever list was implemented the code wont work
// so we were asked to  override it , to avoid this , we have default  method in interface
// now if you want to override a method you can , but there is  no neccessity 


// now we can also have static methods in interface  


// so a lot like abstract classes
// after java 9 we can also have private method -- only called by
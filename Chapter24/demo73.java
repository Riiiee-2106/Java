package Chapter24;
public class demo73{

    public static void main(String[] args) {

        // there are lots of changes after java 8 
        Dog ani = new StreetDog();
        ani.eat();
        ani.bark();
    }
}


// Interface inheritance

interface Animal{
    void eat();
}


interface Dog extends Animal{  //one interface can extends the other interface - as it is not defining the method declared by above interface instead it is providing more functionalities to it

    // interface cannot implement another interface
    

    void bark();

}

class StreetDog implements Dog{


    @Override 
    public void eat(){
        System.out.println("street dog eating ");
    }


    @Override 
    public void bark(){
        System.out.println("street dog barking");
    }
}
package Chapter27;

public class demo89 {


    public static void main(String[] args) {
        Box<Fish> b = new Box();       
    }
    


    // <T extends Class & InterfaceName1 , InterfaceName2>
}


class Box<T extends Animal &  Swimmable>{
   T value;

   

}


class Animal{

    void display(){
        System.out.println("displaying animal");
    }

}

interface Swimmable{
    void swim();
}

class Dog extends  Animal{


}

class Fish extends Animal implements Swimmable{

    public void swim(){
        System.out.println("fish is swimming");
    }

}
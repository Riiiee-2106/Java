package lec27;

public class demo79 {

    public static void main(String[] args) {
        Box <Fish> b = new Box<>();
        
    }
    
}



class Box <T extends Animal & Swimmable>{
    T value;
}
class Animal {
    void display(){
        System.out.println("displaying animal");
    }
}


interface Swimmable{
    void swim();
}

class Fish extends Animal implements Swimmable{
    public void swim(){
        System.out.println("swimming fish");
    }

}

class Dog extends Animal{

}


// class something<T extends a class and interface>
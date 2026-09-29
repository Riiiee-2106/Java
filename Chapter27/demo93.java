package Chapter27;
import java.util.*;
public class demo93{


    // generic with lower bound (super)  
    public static void main(String[] args) {
        List<Animal>animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        

        fun(animals);

    }


    static void fun(List<? super Animal>values){
        // writing is allowed
        values.add(new Animal());
        values.add(new Labrador());
        values.add(new Cat());
       /*  for(Animal a:values){
        this is not allowed without object obj
        }*/
        
        for(Object obj:values){
            Animal a = (Animal)obj;
            a.eat();
        }

    }

    }


class Animal{

    void eat(){
        System.out.println("animal eating");
    }

    void walk(){
        System.out.println("animal walking");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("dog barking");
    }
}

class Labrador extends Dog{
    @Override
    void eat(){
        System.out.println("labrador eats");
    }
}

class Cat extends Animal{

    void meow(){
        System.out.println("cat meow");
    }
}
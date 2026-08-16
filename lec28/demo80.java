package lec28;

import java.util.ArrayList;
import java.util.List;

public class demo80 {

    public static void main(String[] args) {
        
        // invariant in generics

        // Animal ani  = new Animal();
        // ani.eat();
        // ani.walk();

        // Dog d = new Dog();
        // d.bark();


        // List<Dog> dogs = new ArrayList<>();
        // List <Animal> animals = dogs;//compile time error  --invariant 



        // Dog[] dog = new Dog[10];
        // Animal[] animal = dog;

        // animal[0] = new Animal();

        // for(Animal a:animal){
        //     a.eat();
        // }

        // ArrayStoreException

        
        
        Dog[] dog = new Dog[10];
        Animal[] animal = dog;

        animal[0] = new Dog();
        animal[1] = new Dog();
        animal[2] = new Dog();
        animal[3] = new Dog();
        animal[4] = new Dog();
        animal[5] = new Dog();
        // animal[6] = new Animal();//covariant //runtimeerror


        for(Animal a:animal){
            if(animal==null){
                continue;
            }
            a.eat();
        }



    }
    
}


class Animal{

    void eat(){
        System.out.println("eating animal");
    }

    void walk(){
        System.out.println("walking animal");
    }
}

class Dog extends Animal{
    void bark(){

        System.out.println("dog barking");
    }

}
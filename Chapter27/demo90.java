package Chapter27;

import java.util.ArrayList;
import java.util.List;

public class demo90 {

    public static void main(String[] args) {

        // Invariant in generics

       /*
        this is allowed in generics
        Animal a = new Animal();
        Animal animal = new Dog();
        animal.eat();
        animal.walk();

        */


        // animal.bark(); - this wont work


        // java generics are invariant
        List<Dog>dogs = new ArrayList<>();
        // List<Animal>animals = dogs;   ---> cannot convert list of dogs to list of animals


        // but this is allowed in arrays

        // java arrays are covariant

        Dog[]dogss = new Dog[10];
        Animal[]animals = dogss; //this may be allowed in  arrays  but is very risky code


        // no compiler error - but will get runtime exception
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal();

        for(Animal animal:animals){

            if(animal == null){
                continue;
            }
            animal.eat();
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
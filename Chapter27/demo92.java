package Chapter27;

import java.util.*;


// wildcards with upperbound (extends)
public class demo92{
    public static void main(String[] args) {
        // List<Dog>dogs = new ArrayList<>();
        // dogs.add(new Dog());
        // dogs.add (new Dog());
        // fun(dogs);

        List<Animal>animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);


        // List<Integer>l = new ArrayList<>();
        // fun(l); -->now this is not possible -->compile time error
        
    }


    static void fun(List<? extends Animal>values){
        for(Animal a:values){
            a.eat();
        }

        // reading is safe

        // writing is not
        // values.add(new Animal());  ---> if someone sends cat and i add dog it is not possible - sibling relation
        // or i send dog and then add animal --> child -parent relation 
       

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


class Cat extends Animal{

    void meow(){
        System.out.println("cat meow");
    }
}
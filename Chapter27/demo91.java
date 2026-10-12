package Chapter27;
import java.util.*;
public class demo91{

    public static void main(String[] args) {
        List<Dog>dogs = new ArrayList<>();
        
        dogs.add(new Dog());
        dogs.add(new Dog());
        // fun(dogs); --> not allowed to pass this

        List <Animal>animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
        
    }

   /* public static void  fun(List<Animal>animals){
        for(Animal animal:animals){
            animal.eat();
        }
    }*/

        public static void fun(List<?>values){
            for(Object obj:values){
                System.out.println(obj.getClass().getName());
            }
            // values.add(new Animal());  -->this isn't possible  -->flexible
            // cannot add and read only using object - wildcard provide limited scope
            // so we use wildcards with bounds

            Object obj = values.get(0);
            // Animal a = (Animal)obj; -->this is possible but runtime exception if Animal is not passed
            System.out.println(obj.getClass().getName());

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
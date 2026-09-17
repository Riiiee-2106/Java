package Chapter18;

public class demo50 {


    /*      
            Abstract classes   
    1.cannot be instantiated directly
    2.can contain abstract method(method without implementation)
    3.can also contain normal methods
    4.is meant to be extended
    
    */
    public static void main(String[] args) {
        Animal a = new Dog("jerry");
        a.makeSound();
    }
    
}

abstract class Animal{
    String name;
    static String type;

    abstract void makeSound();


    Animal(String name){
        this.name = name;
    }

    void sleep(){
        System.out.println("animal sleeps");
    }

    static void eat(){
        System.out.println("animal eats");
    }

     private void run(){
        System.out.println("animal runs");
    }
}


class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override 
    void makeSound(){
        System.out.println("dog make barking sound");
    }
}



//questions -- 
//1.can abstract classes have constructor  ? yes , as it can be used by child

//2.can abstract classes can be final? - no as it will not get inherited, so either classes be final or abstract

//3.can abstract class have static variables?->yes, static variables,static methods,static block everything is allowed (it is all related to a class but still it can be done),static but not final

//4.can abstract classes private methods? - yes  but not abstract

//5.can abstract classes have final methods? yes but not abstract 

//6.can abstract classes have no abstract methods ? yes,so that no object can be created ,or i make default implementation of a method but it can be overriden

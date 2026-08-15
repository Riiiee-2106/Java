package lec18;

public class demo45 {

    // abstract classes 
    // 1.cannot be instantiated directly
    // 2.can contain abstract method(method without implementations)
    // 3.can also contain normal methods
    // 4.is meant to be extended

    public static void main(String[] args) {
        Animal ani = new Dog("bruno");
        ani.makeSound();
        
    }
}


abstract class Animal{

      String name;
    abstract void makeSound();
  

    void sleep(){
        System.out.println("sleeping");
    }

    Animal(String name){
        this.name = name;
    }

    static void fun(){
        System.out.println("fun");
    }

    private void fun2(){
        System.out.println("fun2");
    }

    final void fun3(){
        System.out.println("fun3");

    }
}

class Dog extends Animal{

    // abstract class can have constructor which can be called by its child constructor using super
     Dog(String name){
        super(name);
    }


    @Override
    void makeSound(){
        System.out.println("bark");
    }

   
}





// questions --
// 1.can abstract class can have constructors  -- yes
// 2.can abstract class can be final --- no
// 3.can abstract class have static methods,or variables,or static block 
// 4.private methods in abstract class -- but not abstract -- yes
// 5. can abstract class have final methods -- yes -- but not abstract
// 6.can abstract class have no abstract methods -- yes
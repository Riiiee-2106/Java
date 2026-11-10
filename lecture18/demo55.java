public class demo55 {

    public static void main(String[] args) {
        Animal a = new Dog("bruno");
    }
    
}

abstract class Animal{

    String name;
    Animal(String name){
        this.name = name;

    }

    static void bark(){
        System.out.println("barking");
    }

    abstract void makeSound();

    void sleep(){
        System.out.println("animal is sleeping");
    }

    private void eat(){

    }

    final void run(){

    }
}


class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    @Override 
    void makeSound(){
        System.out.println();
    }
}

/*ABSTRACT CLASSES - 
1. cannot be instantiated directly
2.can contain abstract method (method without implementation)
3.can also contain normal methods
4.is meant to be extended */


/*questions around abstract classes - 
1. can abstract classes have constructors - yes */ //if i can't make object of abstrcat then why ?  becoz it may be used in child class constructor - and it calls parent class constructor

/*2.can abstract classes be final - no, as then we can't make its child(inherit)*/

/*3. can abstract classes have static methods/variables/static blocks - yes  */

/*4. can abstract classes have private methods - yes but not abstract  - as it is not visible outside the class*/

/*5.can abstract class have final methods - yes but not abstract */

/*6. can abstract class have no abstract methods - yes , as it give a general definition , if required it can be changed or not  */

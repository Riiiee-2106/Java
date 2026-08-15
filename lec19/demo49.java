package lec19;

public class demo49 {

    // Local class example:
    // 1. Create an object of Outer.
    // 2. Call the greet() method on that object.
    // 3. Inside Outer.greet(), a Local class is defined and instantiated.
    // 4. The Local class method prints "hello".
    // This shows the execution flow of a local inner class in Java.

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
        
    }
    
}


class Outer{
    // void greet(){
    //     System.out.println("hello outer");



    void greet(){
        class Local{
            void greet(){
                System.out.println("hello");
            }
        }
        Local l = new Local();
        l.greet();
    }



}


// who it can access
// static and non static methods
// contructors ,implement as well as extend 



package lecture17;

public class demo47 {

    public static void main(String[] args) {
        
        //static methods are not overridden - because they belong to class and not to object 

        //they are not binded by whose obj it is refering
        //but to whom it is reference of - like a is a reference of A class

        A a = new B();
        a.fun();
    }
    
} 


class A{
    static void fun(){
        System.out.println("Hello");
    }
}

class B extends A{
    static void fun(){
        System.out.println("Bye");
    }
}
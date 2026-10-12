package Chapter17;
public class demo44 {

    public static void main(String[] args) {

        //static methods in runtime dont get overriden


        //why static methods dont get overriden?
        //they belong to class not to an object
        //biding happens by reference  - as a is bind to A , not to what it points which is B()
        A a = new B();
        a.fun();
        
    }
    
}


//static keyword

class A{
    static void fun(){
        System.out.println("A");
    }
}


class B extends A{
    static void fun(){
        System.out.println("B");
    }
}
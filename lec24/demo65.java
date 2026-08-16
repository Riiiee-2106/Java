import java.util.*;
public class demo65 {

    public static void main(String[] args) {

    //   D d = new D();
    //   d.show();

    C c = new C();
    c.fun();
        
    }
    
}



// before java 8
// interface A{
//     void show();
// }

// interface B extends A{
//     void show();
// }

// interface C extends A{
//     void show();
// }

// class D implements B, C{
//     @Override
//     public void show(){
//         System.out.println("implementing show");
//     }
// }


// after java8
// interface A{
//     void show();
    
// }

// interface B extends A{
//     default void show(){
//         System.out.println("B show method");
//     }
// }

// interface C extends A{
//     default void show(){
//         System.out.println("C show method");
//     }
// }

// class D implements B, C{
//     @Override
//     public void show(){
//       System.out.println("overriden show method by D ");
//     }

// }

// if two interface have its own same default method -- child needs to override it no matter what




// but if you want to call specific parent interface method - default then




// after java8
// interface A{
//     void show();
    
// }

// interface B extends A{
//     default void show(){
//         System.out.println("B show method");
//     }
// }

// interface C extends A{
//     default void show(){
//         System.out.println("C show method");
//     }
// }

// class D implements B, C{
//     @Override
//     public void show(){
//     B.super.show();
//     C.super.show();
//     }

// }



// Java Resolution priority rule

interface A{
 default void fun(){
    System.out.println("fun of A");
}

}

class B{

    public void fun(){
        System.out.println("fun of B");
    }

}

class C extends B implements A{


}

// class will be given priority  over interface
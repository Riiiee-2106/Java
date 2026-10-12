package Chapter24;

public class demo75 {

    public static void main(String[] args) {
        D d = new D();
        d.fun();

        C1 c = new C1();
        c.fun();
    }
    
}

/* 
interface A{
    void fun();

}

interface B extends A{

}

interface C extends  A{

}

class D implements  B , C{
    @Override 
    public void fun(){
        System.out.println("fun called from D");
    }
}
    */




// after java 8 - when default methods came

// if D is implementing B and C which have there own implementation of fun method - then it is a neccessity of class D to override the fun method


/* 
interface A{
    void fun();

}

interface B extends A{
    default void fun(){
        System.out.println("fun from B");
    }
}

interface C extends  A{
      default void fun(){
        System.out.println("fun from B");
    }
}

class D implements  B , C{
    @Override 
    public void fun(){
        System.out.println("fun called from D");
    }
}

*/



// what if i want to call fun method of interface B

interface A{
    void fun();

}

interface B extends A{
    default void fun(){
        System.out.println("fun from B");
    }
}

interface C extends  A{
      default void fun(){
        System.out.println("fun from C");
    }
}


// we can simply call B interface with super keyword and fun method
class D implements  B , C{
    @Override 
    public void fun(){
        B.super.fun();
        C.super.fun();
    }
}


// if fun is defined in interface B but not in C interface , class D does not need to override it,but if both interfaces provide same fun method java gets confused in that case it needs to provide fun method overriden definition through class D


/*java resolution priority rule  */

interface A1{
    default void fun(){
        System.out.println("fun from A1");
    }

}
class B1{
     public void fun(){
        System.out.println("fun from B1");
    }

}

class C1 extends B1 implements A1{
    // ALWAYS PRIORITIZE THE CLASS METHOD IF SAME METHODS ARE DEFINED IN BOTH

}
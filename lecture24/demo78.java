public class demo78{
    public static void main(String[] args) {
        D d = new D();
        d.fun();
        
    }
}

/*
interface A{
    void fun();
}

interface B extends A{
    void fun();

}
interface C extends A{
    void fun();

}

class D implements  B,C{
    @Override
    public void fun(){
        System.out.println("D fun method");
    }
}
*/

interface A{
    void fun();
}

interface B extends A{
   default void fun(){
    System.out.println("B fun method");
    }

}
interface C extends A{
    default void fun(){
        System.out.println("C fun method");
    }

}

class D implements  B,C{ 
    //we need to override it to shadow upper defined definition of method
    /*@Override
    public void fun(){
        System.out.println("D fun method");
    }*/

   //if want to call B method  and then C method , write - 
   @Override
   public void fun(){
   B.super.fun();
   C.super.fun();
}
}
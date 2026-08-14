package lec17;

public class demo42 {

    public static void main(String[] args) {
        A a = new B();
        // a was reference of class A, not to the class it was pointing
        a.fun();

        A a1 = new B();
        a1.fun2();

        System.out.println(a1.x);  // variables do not participate in polymorphism
        
        
        System.out.println(a1.gety()); // B class method

        B b = new B();
        System.out.println(b.x);


        // final class --> you cannot create child of that class
    }
    
}


//static

class A{
    static void fun(){
        System.out.println("hello A from fun");
    }


    final void fun2(){
        System.out.println("hello A from fun2");

    }


    private void fun3(){
        System.out.println("hello A from fun3");
    }


    int x = 10; //cannot override

    int gety(){
         int y = 10;
        return  y;
    }
}


class B extends A{

    //fun didnot get overriden as it was static
    static void fun(){
        System.out.println("hello B");
    }

    // void fun2(){

    // } --- gives error cannot override fun2 as it is final


    void fun3(){
        // this fun3 is different from A fun3
        
        System.out.println("hello B from fun3");
    }

    int x = 20;

    int gety(){
        int y = 20;
        return y;
    }
}

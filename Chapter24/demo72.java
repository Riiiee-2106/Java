package Chapter24;

public class demo72 {

    public static void main(String[] args) {
         
        // MathConstant mc = new Random();
        // mc.fun();  --> reference of mathconstant so can call its functions only


        System.out.println( MathConstant.PI_VALUE);
    }
    
}


// variables inside interfaces - rule 1 
// it supports multiple inheritance - rule 2


interface MathConstant{
    double PI_VALUE = 3.14; //by default interface variables are public static final , interface has no object ,so only non static variables

    // final - because interface only have constant values - which are static

    int VALUE = 10;

    // void fun();

}


// if we made class then we had to make them public static final 

class Random implements  MathConstant{

    // @Override 
    // public void fun(){
    //     System.out.println(VALUE);
    // }
}



/*  multiple inheritance is not supported through class

class A{

}

class B{

}

class C extends A,B{

}

*/


// but multiple inheritance is supported through interface

interface A{

    void fun();
}

interface B{
    void fun2();
}
class D{

}


// ONE CLASS CAN EXTEND ONLY ONE CLASS, BUT MANY INTERFACES
class C extends D implements A,B{


    @Override
    public void fun(){
        System.out.println("fun of interface A");
    }


    @Override
    public void fun2(){
        System.out.println("fun2 of interface B");
    }

}
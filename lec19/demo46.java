package lec19;

public class demo46 {



    // static nested class
    public static void main(String[] args) {


        // inner class object without making outer class object
        // inner class  is associated with class and not its object
        // PrentclassName.ChildClassName  variable = new  PrentclassName.ChildClassName ()
        
       
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner(outer);
         System.out.println(Outer.x);
        inner.fun(outer);
        
    }
    
}


// static nested class

class Outer{
     static int x=4;
    int y ;
    


    // static void fun(){
    //     System.out.println(y);
    // }


    static class Inner{

        // we can access non static fields thorugh constructors as well
        Outer outer;

        Inner(Outer outer){
            this.outer = outer;
        }

        void fun(Outer outer){
            System.out.println("hello");
            // System.out.println(y);


            // can access when made Outer reference and passed it in method
            System.out.println(outer.y);


        }

    }
}



// property - 
// cant access outer class non-static method or variable -- as y is linked to outer object
// it can access only by making outer class ref

// static nested class - can have method, constructor, variables, it can implement, extend


//  inner class can have static method and static variables


// it can have access modiefier as well
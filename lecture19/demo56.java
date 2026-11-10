public class demo56{

    public static void main(String []args){
        Outer outer = new Outer();


        //we dont need Outer class ref for inner class
        Outer.Inner inner = new Outer.Inner(outer);
        // inner.fun();

    }
}

//static nested class
 class Outer{

   
    //1.inner class cannot access nonstatic method of outer


    /*private can be accessed in constructor as well*/private static int x = 4;
    int y1;

    static class Inner{
         Outer outer; //either make Outer class obj
        //2.static class can call static members only
        // int y;
  
        Inner(Outer outer){
            this.outer = outer;
        }

        //or pass Outer class ref here
        void fun(Outer outer){
            System.out.println("Hello");
                System.out.println(x);
        // System.out.println(y1);
        System.out.println(outer.y1);
        }


    }
 }

 /*can access static functions /variables only , not non static functions 
 2. it can extend any class
 3.implements interface
 4. work like normal classs - constructor , methods,variables etc
 5. inner nested class - can have static variables and methods 
 6. also provide access modifiers as well*/


public class demo58 {
    

    public static void main(String[] args) {
        // Outer.Inner inner = new Outer.Inner(); as inner class is not wholely related to outer class
        //inner class needs outer class object 

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.fun();

        //without making outer class obj
        // Outer.Inner inner2 = new Outer().new Inner();

        inner.fun();
        Outer.Inner.fun2();
        inner.fun2();


        
    }
}


class Outer{
   
    static int y = 10;

    int x = 10;
    class Inner{
         //this belong to obj of outer class rather whole class
         int x = 20;
        void fun(){
            System.out.println("fun inner");
            System.out.println(x); 
            System.out.println(Outer.this.x);
        }


        //upto java 16 java inner nested class - static was not allowed
        
        //but now it is allowed
        static void fun2(){
            System.out.println(y);
        }

    }
}
package Chapter19;

public class demo52 {

    public static void main(String[] args) {
        
        //outer object
        Outer outer = new Outer();

     

        //inner object with using outer object
        Outer.Inner  inner = outer.new Inner(); 
        //OuterclassName.innerclassName InnerclassVariable = objofouterclass.new innerclassName();


        //without using outer class object we can make inner class object
        Outer.Inner inner2 = new Outer().new Inner();
        //outerclassname.innerclassname  innerclassvariable = new outerclassname().new innerclassname();

        inner.fun();
        inner.fun2();
        Outer.Inner.fun2();

    }
    
}



class Outer{

    int x = 10;


    //we cant make inner nested class object without making outer class object

    class Inner{
            int x = 20;

        void fun(){
            System.out.println("hello");
            System.out.println(x);
            //this is the reference of Outer class
            System.out.println(Outer.this.x);
        }


        static void fun2(){
            System.out.println("hello");
        }

        //upto java 16 i cant define static variable/methods,but now i can define static methods/variable in nested inner class




    }
}
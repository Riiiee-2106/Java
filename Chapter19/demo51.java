package Chapter19;

public class demo51 {


    public static void main(String[] args) {
        
        //how to make outer class object
        Outer outer = new Outer();

        System.out.println(Outer.x);

       


        //how to make inner static nested class object
        // inner static nested class object does not need outer class object
        //we can make object with outer class name
        
        //outerclassname.innerstaticnestedclassname  variablename = new outerclassname.innerstaticnestedclassname()
         Outer.Inner inner = new Outer.Inner(outer);

         inner.funInner();

         
    }
    
}


class Outer{

    static int x;
    int y;

    static  void funOuter(){

    }

    static class Inner{

        // void funInner(){
        //     System.out.println("inner class fun");
        //     System.out.println(x);



           // System.out.println(y);  --> cannot access non static member , as non static member gets made for each object , so which object member i am trying to access?, and also we can't access object of outer class as it is not made for inner static nested class object


        // void funInner(Outer outer){
        //     System.out.println(outer.y);
        //     System.out.println(x);

        Outer outer;
        Inner(Outer outer){
            this.outer = outer;
        }

       void  funInner(){
            System.out.println(outer.y);
        }

        private static int age = 21;

        static void funInner2(){

        }
        
    }

    /*static inner  nested class  properties -
    1.inner static nested class cannot access non static fields/methods of outer class  - we can do this by one condition (by passing reference of outer class in either method of inner static nested class or constructor of inner static nested class)  
    
    
    2.static inner nested class - can extends classes , implement interfaces, we can have many methods,constructors,and fields
    
    static - methods,field
    non static - methods,fields both can be defined in inner static nested class
    
    
    3.can we write - access modifiers in all variables , methods?  yes
    access modifier - is best for static inner static  nested class*/



    //eg for 3 point

    class BankAccount{



        //helper class
        private static class InterestCalculator{
            static private double calculateYearly(double p,double r){
                return p*r;
            }

            //i can make many static methods within inner static nested class - inside outer class bankaccount , but if i have made it private then these methods cannot be accessed by anyone from outside of class only by internal methods, or internals of class


        }



        public double computeInterest(double principal){
            return InterestCalculator.calculateYearly(principal, 0.09);

        }


        //4. use cases of inner static nested class - as helper class, used in builder desgin pattern


        //5. if you want to have static methods inside inner static nested class


        //6. req/res dto
    }
}
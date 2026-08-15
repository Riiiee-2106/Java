package lec19;

public class demo48 {

    public static void main(String[] args) {

        Outer outer = new Outer();


        //                  parent obj.new childclass()
        Outer.Inner inner =  outer.new Inner();
        inner.fun();

    //    Outer.Inner inner2 = new Outer().new Inner();  //when we dont need outer object


    inner.fun2();
        
    }
    
}





class Outer{

    int x = 10;
    int y = 20;

    static void fun(){
        System.out.println("outer fun");
    }

    class Inner{

        int x = 100;

        void fun(){
            System.out.println(x);  //100
            System.out.println("inner fun");
            System.out.println(Outer.this.x);  //calling Outer ref variable .x

            // Outer.this --> ref of Outer obj .x
            // Outer.this.x

            System.out.println(y); //outer.y
             Outer.fun();

           
        }
           static void fun2(){
            System.out.println("inner fun2");
           }

          
        }
    }




// same property like static nested class 
// but static method and static variables are not allowed --- but now it is allowed (we will cover this later)
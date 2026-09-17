package Chapter19;

public class demo53 {

    //local class

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet(); 
    }
    
}


class Outer{
    void  greet(){
        class Local{  //use of this local class within this method only , local class can be replaced by some other code as well, less use
            void hello(){
                System.out.println("hello");

            }

            void sayHello(){

            }

            void  sayBye(){

            }

        }

        Local l = new Local();
        l.hello();
    }


    class Outer2{
        static private int x = 4;

        void greet(){
            int y = 5;
            // y =15; --> final or effective final variable only allowed
            class Local2{
            
                void sayHello2(){
                    System.out.println(y);  //use variable in side methods which are final or effective final , not modified
                    System.out.println("hello");
                }

            }
        }
    }
}


/*

local class can be made in - 
 constructor
 method
 if
 loop
 static block
 
 */


 /*what a local class can access
 1.  it is a non static class - so all rules of inner class
 (i.e) -2.  can access static variable/methods and non static variable/methods
 3. imp rule - effectively final variable  */
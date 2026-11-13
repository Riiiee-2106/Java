

public class demo79{
    public static void main(String[] args) {
        
        //java Resolution priority rule - 
        //interface A , class B, class C extends B implement A 
        //both A and B have same fun method which one will C prioritize - it will prioritize class function
        C c = new C();
        c.fun();
    }
}

interface  A{
    default void fun(){
        System.out.println("A interface fun"); 
           }

}

class B{
    public void fun(){
        System.out.println("B class fun");
    }

}

class C extends B implements A {
 
}
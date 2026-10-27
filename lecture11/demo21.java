public class demo21 {

    public static void main(String[] args) {
        
        // chaining of functions
        System.out.println("main");
        A();
        System.out.println("returned to main");

    }
    

    static void A(){
        System.out.println("A");
        B();
        System.out.println("returned to A");
    }

    static void B(){
        System.out.println("B");
        C();
        System.out.println("returned to B");
    }

    static void C(){
         System.out.println("c");
         System.out.println("returning from C");
        return;
    }
}

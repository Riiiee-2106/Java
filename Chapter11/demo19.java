package Chapter11;

public class demo19 {

    public static void main(String[] args) {
        
        //chaining of functions
        System.out.println("in main function");
        A();
        System.out.println("back to main");
    }

    static void A(){
        System.out.println("in function A");
        B();
        System.out.println("back to A");
    }

    static void B(){
        System.out.println("in function B");
        return;
    }
    
}

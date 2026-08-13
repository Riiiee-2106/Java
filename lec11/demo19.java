package lec11;

public class demo19 {

    // method chaining

    public static void main(String[] args) {
        A();
        System.out.println("hello main");
    }

    static public void A(){
        B();
        System.out.println("hello A");
    }

    static public void B(){
        System.out.println("hello B");
    }
    
}

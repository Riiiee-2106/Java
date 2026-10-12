package Chapter25;

public class demo76 {

    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat("  World"); //object declared helloworld but not pointed

        // strings are immutable we can't change it
        System.out.println(s1);
    }
    
}

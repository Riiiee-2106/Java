package lec25;

public class demo67 {

    public static void main(String[] args) {
        // string literal
        String s1 = "Hello";
        String s2 = "world";
        String s3 = "Hello";

        // string new keyword
        String s4 = new String("Hello");
        System.out.println(s1.equals(s4));  //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1 == s3);   //true
        System.out.println(s1 == s4); //false


    }
    
}

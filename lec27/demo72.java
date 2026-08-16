package lec27;

public class demo72 {


    public static void main(String[] args) {
    
    // upcasting

    String s = "Hello";
    Object obj  = s;

    System.out.println(obj);


    // downcasting

    // Object obj2 = 10;
    // String s2 = (String) obj2; //no compile time error  ---classcastexception

    // System.out.println(s2);

    Object obj3 = "hello";
    String s3 = (String)obj3;
    System.out.println(s3);



    

    }
    
}

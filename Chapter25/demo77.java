package Chapter25;

public class demo77 {

    public static void main(String[] args) {
        
    

    String s1 = "Hello"; //literal 
    String s2 = "Hello";


    System.out.println(s1==s2);  //compares the references -->true
    System.out.println(s1.equals(s2));//true

    String s3 = new String("Aditya");
    String s4 = new String("Aditya");

    System.out.println(s3==s4); //false
    System.out.println(s3.equals(s4));//true

    }
    
}

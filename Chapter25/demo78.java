package Chapter25;

public class demo78 {

    public static void main(String[] args) {
        
        String s1 = "Ja"+"va"; //compile time - Java - stored in string pool and s1 points to it
        String s2 = "Java"; //s2 points to already present Java in string pool
        System.out.println(s1==s2); //true


        String s3 = "Hello"; //hello present in stringpool and s3 points to it
        String s4 = s3+" World" ;//gets resolved in runtime  - heap
        System.out.println(s3==s4); //false
        String s5 = "Hello World";  //literal - string pool
        System.out.println(s4==s5); //false


        String s6 = "Hello";
        String s7 = s6; //get resolved in compile time
        System.out.println(s6 ==s7); //true


        String s8 = "Hello"; //no one refer to it once s8 points to World
        s8 = "World";
        System.out.println(s8);


        String s9 = new String("HELLO"); //literal as well as using new keyword - string pool and heap both includes it
        String s10 = "HELLO"; //points to already present HELLO in string pool
        System.out.println(s9==s10);//false









    }
    
}

package Chapter20;

import java.io.IOException;
public class demo55 {
    
    public static void main(String[] args)throws IOException {
        
 //how inputstream works


 //read() works on int ,not in char
        int x = System.in.read();
        System.out.println(x);


//if i try to take it in char there will be a type mismatch error

        int i = System.in.read(); //"aditya"
        System.out.println((char)(i));//"a"  - read one byte at a time



    }
}

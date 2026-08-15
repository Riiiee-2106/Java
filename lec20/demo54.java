package lec20;

import java.util.*;

public class demo54 {


    // scanner classes


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  //inside constructor we always need to pass InputStream to work with keyboard stream

        String name1 = sc.next(); //takes one word
        String name = sc.nextLine(); //takes sentence until entered was pressed


        int age = sc.nextInt();
        double price = sc.nextDouble();
        System.out.println(name);

        boolean isValid = sc.nextBoolean();
        // scanner class have methods


        // Scanner class  is slow than bufferedreader
        
    }
    
}

package lec25;

public class demo68 {

    public static void main(String[] args) {
        String s1 = "Ja"+"va";
        String s2 = "Java";

        System.out.println(s1==s2);  //true

// -----------------------------------------------------------------------------

        String s3 = "java"; //stringpool
        String s4 = s3+" is amazing";  //heap
        String s5 = "java is amazing"; //stringpool

        System.out.println(s4==s5); //false

// -----------------------------------------------------------------------------

        String s6 = "hello";
        String s7 = s6;
        System.out.println(s6==s7);  //true

// ----------------------------------------------------------------------------

String s8 = "hello";
s8 = "world";
System.out.println(s8);


// ----------------------------------------------------------------------------

String s9 = new String("Hello");
String s10 = "Hello";
 
System.out.println(s9==s10);  //false


// ----------------------------------------------------------------------------

// Problem of immutability

String s11 = "";
for(int i=0;i<=5;i++){
    s11+=i;
    System.out.println(s11);
}
    }
    
}

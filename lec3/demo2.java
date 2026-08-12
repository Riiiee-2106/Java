package lec3;
// variable and datatype

public class demo2 {

    public static void main(String[] args) {

        // Integer ---->byte, short, int, long

        byte n1 = 4;
        short n2 = 100;
        int n3 = 20000;
        long n4 = 10_00000000;  // when number is large then we can use underscore to make it more readable
        // compiler will ignore underscore while compiling the code
        // but dont apply underscore at the start or end of the exponent or next to decimal point

        System.out.println("Integer value -- byte, short, int, long: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);

        // Real Numbers ----> float, double

        float n5 = 4.5f;  //we want to store decimal value in float then we have to add f at the end of the value otherwise it will give error -- as float is not optimized as of now processors


        double n6 = 4.5;   //--- standard way to store decimal value in double


        double n10 = 6.022e23;  // this is scientific notation, 6.022 * 10^23 

        System.out.println("Real Numbers value -- float, double: " + n5 + ", " + n6);
        System.out.println("Scientific Notation value -- double: " + n10);

        // Character ----> char
        char alphabet = 'a';

        // 'a' --> 97 --->1100001
        System.out.println("Character value -- char: " + alphabet);

        // Boolean ----> boolean
        boolean isJavaFun = true;
        System.out.println("Boolean value -- boolean: " + isJavaFun);


        // other number system -- binary(0-1) - octal(0-7) - hexadecimal(0-9, A-F)
        int n7 = 0b101; // binary    -- 0b
        int n8 = 010; // octal  - 8  --0
        int n9 = 0xFF; // hexadecimal  - 255  --- 0X

        System.out.println("Other number system value -- binary, octal, hexadecimal: " + n7 + ", " + n8 + ", " + n9);
    
    }
}
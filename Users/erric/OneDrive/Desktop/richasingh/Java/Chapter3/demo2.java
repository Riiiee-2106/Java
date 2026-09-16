package Chapter3;

public class demo2 {

    public static void main(String[] args) {
        

        // decimal number system and floating number system
        // Integer -->  byte,short,int,long

        byte b1 = 5;
        short s1 = 290;
        int i1 = 102324488;
        long l1 = 324334657;


        System.out.println("Integer value - byte,short,int,long : +"+b1+","+s1+","+i1+","+l1);


        // Real Numbers --> float, double

        float f1 = 1.99f; 
        //processors are optimized for double - compiler will treat all numbers as double and you're storing this value in float , so we need to add f at last of the value.

        double d1 = 2.3345;

        System.out.println("Real numbers --->float , double : "+f1+","+d1);

        //characters
        char c1 ='a';
        System.out.println("character values ---> char : "+c1);

        // 'a' ---> 97 ---> 01000011 
        // System.out.println(c1);  --- 01000011--->97---->'a' 
        // output - 'a'


        //boolean
        boolean b2 = true;
        System.out.println("boolean values --->boolean: "+b2);



        // number system -- binary,octal,hexadecimal 
                            // 2,8,16 -- bases

        // 0-1 - binary
        // 0-7 - octal
        // 0-9 ,A,B,C,D,E,F -hexadecimal

        byte b3 = 0b101;
        byte b4 = 010;
        int i2 = 0X9F; 

        System.out.println(b3+","+b4+","+i2);


        // float is single precision 
        // double is double precision

        // double have two ways to store value - standard way and scientific way 
        // 1.66 is a standard way
        // 9e23 is scientific way
        double d2 = 9e23;
        double d3 = 6.22e23;


        // we can also separate large values with _ to simplify it

        // do not use it before or after e or decimal .

          
    }
    
}

package Chapter5;
public class demo4{

    public static void main(String[]args){
        // Implicit conversion
        // byte to int
        byte b1 = 24;
        int i1 ;
        i1 = b1;
        System.out.println(i1);


        // Character to int
        char character = 'a';
        int i2;
        i2 = character;
        System.out.println(i2);


        // Explicit conversion
        int i3 = 24;
        byte b2;
        // b2 = i3;  compilor error
        // we have to do casting
        b2 = (byte)i3;
        System.out.println(b2);   //as 24 is in range of byte -127 to 128, we expect the output to be 24


        int i4 = 300;
        byte b3;
        // b3 = i4;
        b3 = (byte)i4;
        System.out.println(b3); //as 300 does not come in range of byte -127 to 128 , we expect num%range of byte (256) = 44 will be the answer



        // Truncating conversion
        float f = 15.456f;
        int i5 ;
        // i5 = f;
        i5 = (int)f;
        System.out.println(i5); //15


        // why we haven't talked about boolean to any datatype conversion
        // because these conversions are not possible

        boolean bool = false;
        // int i6 =(int) bool; //as true is true and false is false ,so it cannot be casted or stored within any datatype


        // Automatic type promotion
        byte b5 = 50;
        // b5  = b5*5; //compile error
        b5 = (byte)(50*2);
        System.out.println(b5);

    }
}
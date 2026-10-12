package lecture5;

public class demo4 {

    // type conversions in java
    public static void main(String[] args) {
        

        // IMPLICIT CONVERSION - (byte to int)
        byte b = 24;
        int i;
        i=b;
        System.out.println(i);  //24

        // (char to int)
        char c = 'a';
        int i2 = c;
        System.out.println(i2);

        // EXPLICIT CONVERSION
       // (int to byte)

       int i3 = 45;
       //byte b2 = i3; error
        byte b2 = (byte)i3;
        System.out.println(b2); //45 as,it is in range of byte

        int i4 = 300;
        byte b3 = (byte)(i4);
        System.out.println(b3); //300%256 = 44


        // Truncating conversion
        float f = 15.543f;
        int i5 = (int)f;
        System.out.println(i5);

        // Boolean to any datatype
        // is not possible ,why? - boolean is a special datatype
        boolean bool = false; //as false is not a number or any value it cannot be passed into i6
        // int i6 = bool; //syntactical wrong



        /*byte b4 = 50;
        b4 = 50*2;  cannot convert int to byte (type promotion)*/

        byte b4 = 50;
        b4 = (byte)(50*2);
        System.out.println(b4);

        









    }
    
}

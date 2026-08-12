package lec5;

public class demo4 {
   
    public static void main(String[] args) {
         // implicit conversion of data types in java

        //  byte to int
        byte b = 24;
        int i;
        i=b;
        System.out.println(i); //24

        // char to int
        char alpha = 'a';
        int i2 = alpha;
        System.out.println(i2); //97

        // explicit conversion of data types in java

        // int to byte
        int i3 = 300;
        byte b1;
        // b1 = i3; // this will give error because 300 is out of range of byte
        b1 = (byte)i3; // explicit conversion
        // 300%256 = 44
        System.out.println(b1); //44



        int i4 = 24;
        // byte b2 = i4; // this will give error because 24 is in range of byte but java does not allow implicit conversion from int to byte
        byte b2=(byte)i4; // explicit conversion
        System.out.println(b2); //24
        // 24%256 = 24


        // truncating conversion
        float f = 16.25f;
        // int i5 = f; // this will give error because float to int is not allowed
        int i5 = (int)f; // explicit conversion --16
        System.out.println(i5); //16


        // why not boolean to any datatype
        // these conversions are not allowed because boolean is not a numeric type and it can only have two values: true or false. Therefore, it cannot be converted to any other data type.

        // boolean b = true;
        // int i6 = b; // this will give error because boolean to int is not allowed



        byte b3 = 50;
        // int i6 = b3*2; here datatype promotion is happening because b3 is byte and 2 is int, so the result will be int

        b3 = (byte)(b3*2); // explicit conversion
        System.out.println(b3); //100



    }




    
}

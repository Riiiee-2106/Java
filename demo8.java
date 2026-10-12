package lecture6;

public class demo8 {

    // BITWISE OPERATOR -  (&,|,^,~,&=,|=,^=,~=,<<,>>,<<<,<<=,>>=,>>>=)
    public static void main(String[] args) {
        int num1 = 5; //00000000 00000000 00000000 00000101
        int num2 = 6; //00000000 00000000 00000000 00000110

        System.out.println(num1&num2); //00000000 00000000 00000000 00000100 =>100 =>4
        System.out.println(num1|num2);//00000000 00000000 00000000 00000111 =>111 =>7
        System.out.println(num1^num2);//00000000 00000000 00000000 00000011 =>011 =>3 
        System.out.println(~num1);//11111111 11111111 11111111 11111010  = - , 00000000 00000000 00000000 00000101+1 = 110 => -6
        System.out.println(~num2);//11111111 11111111 11111111 11111001 => - ,00000000 00000000 00000000 00000110+1 => 111 => -7


        // SHIFT OPERATOR - 


        // left shift-
        byte num3 = 32;
        num3 =(byte) (num3<<1); //64
        System.out.println(num3);

        int num4 = num3<<1;  //128
        System.out.println(num4);
        byte num5 = (byte)(num4); //-128
        System.out.println(num5);
        int num6 = num5<<1;
        System.out.println(num6); //-256

        byte num7 = 64;
        int num8 = num7<<2;
        System.out.println(num8); //256


        // in integer - left shift
        int i1 = 1;
        i1 = i1<<30;
        System.out.println(i1);

        int i2 = 1;
        i2 = i2<<31;
        System.out.println(i2);  //INTEGER.MIN_VALUE


        // right shift-
        byte num9 = 16;
        int num10 = num9>>4;
        System.out.println(num10); //1

        int num11 = 256;
        byte num12 =(byte) (num11>>1); //-128
        System.out.println(num12);

        int i3 = 1073741824;
        i3 = i3>>30;  
        System.out.println(i3);//1

        int i4 = 1;
        i4 = i4<<36; //16 8 4 2 1
        System.out.println(i4); //36%32 = 4 shifts 


        // right shift with zero fill
        int i5 = -64; //11111111 11111111 11111111 11000000
        int i6 = i5>>>1;//01111111 11111111 11111111 11100000
        System.out.println(i6); //2147483616



    }
    
}

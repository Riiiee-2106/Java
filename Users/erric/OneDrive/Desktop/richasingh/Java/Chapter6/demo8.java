package Chapter6;

public class demo8 {

    public static void main(String[] args) {
        // bitwise operations

        int a = 2;
        int b = 3;

        //00000000 00000000 00000000 00000010 -- 2
        //00000000 00000000 00000000 00000011 -- 3
       
        System.out.println(a&b);  //00000000 00000000 00000000 00000010 -- 2
        System.out.println(a|b);  //00000000 00000000 00000000 00000011 -- 3
        System.out.println(a^b);  //00000000 00000000 00000000 00000001 -- 1
        System.out.println(~a);   //11111111 11111111 11111111 11111101  +1 = 00000000 00000000 00000000 00000010 +1 = 11 --> -3
        
        // or simply a negative greater number then the value
        System.out.println(~b); //-4

        // Shift operator
        int num = 1;
        num = num<<30;
        System.out.println(num);
        num = num<<1;
        System.out.println(num);

       

        // right shift (>>)

        int num1 = -128;
        System.out.println(num1>>1);

        // right shift with zero
        int num2 = -2147483648;
        System.out.println(num2>>>1 );



    }
    
}

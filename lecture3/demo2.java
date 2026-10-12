public class demo2{
    public static void main(String[]args){

        // variable declaration and datatypes

        // Integer --> (byte,short,int,long)
        byte n1 = 10;
        short n2 = 129;
        int n3 = 40_000;
        int n4 = 10_23_435;
        System.out.println("Integer values: "+n1+","+n2+","+n3+","+n4);

        // Real Number --> (float,double)
        float n5 = 10.5f; //as now we processors are double optimized so to store a float value we need to tell compiler by passing number with a f to tell we have stored a float value
        double n6 = 12.435;
        System.out.println("Real Number values: "+n5+","+n6);

        // Characters -->(char)
        Character n7 = 'a';  //'a'-->97--->01100001
        System.out.println("Character values: "+n7); //01100001--->97--->'a'
        
        // Boolean -->(boolean)
        boolean n8 = true;
        System.out.println("Boolean values: "+n8);

        // Number System --> Binary(2),Octal(8),Hexadecimal(16)
        int n9 = 0b101; //binary (0-1)
        int n10 = 011; //octal (0-7)
        int n11 = 0X15; //hexadecimal(0-9,ABCDEF) (0-15)RANGE
        System.out.println("Number System: "+n9+","+n10+","+n11);


        // float is - single precision
        // double is - double precision 

        // double has two ways --> Standard way and Scientific way
        // double n12 = 10.234;   -->Standard way
         double n13 = 6.22e23;  //-->Scientific way
         System.out.println("Scientific way of double: "+n13);

        //  also a large number can be expressed using _  
        // eg -  10_23_29_293;  but this cannot be used in decimal values before or after . (decimal)
        // and cannot be used in scientific way of double representation before or after e
        





    }
}
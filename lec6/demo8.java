package lec6;

public class demo8 {
    // bitwise operator

    public static void main(String[] args) {
        // &,|,~,^,>>,<<,>>>
        
        int a = 2;
        int b = 3;
        int c = a&b; //--2
        int d = a|b; //--3
        int e = a^b; //--1
        int f = ~a; //--(-3)
        int g = ~b;  //--(-4)

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        byte h = 8;
        h = (byte)(h<<3);
        System.out.println(h);
         h = (byte)(h<<1);
        System.out.println(h);
        int h1 = h<<1;
        System.out.println(h1); 

        int i = 128;
        i = i<<1;
        System.out.println(i);

        int j = 1;
        j = j<<30;
        System.out.println(j);
        j = j<<1;
        System.out.println(j);

        byte k = (byte)128;
        k = (byte)(k>>1);
        System.out.println(k);

        int l = 128;
        l = l>>1;
        System.out.println(l);

        int m = -2147483648;
        m = m>>>1;
        System.out.println(m);

    
    }
}

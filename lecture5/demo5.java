package lecture5;

public class demo5 {

    public static void main(String[] args) {
        // type promotion

        byte b = 43;
        char c = 'a';
        short s = 10055;
        int i = 1_000_00;
        float f = 12.345f;
        double d = 1000.12345;


        double result = (f*b)+(i/c)-(d*s);
                    //  float+int-double  ---> double
        System.out.println((f*b)+" + "+(i/c)+" - "+(d*s));
        System.out.println("result: "+result);
    }
    
}

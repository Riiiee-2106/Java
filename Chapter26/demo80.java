package Chapter26;

public class demo80 {


    // constructors in string
    public static void main(String[] args) {
        
        // string through constructor
        String s1 = new String(); //empty string
        System.out.println(s1);
        String s2 = new String(""); //empty string
        System.out.println(s2);
        String s3 = new String("Hello");




        // direct string stored
        String s4 = "Aditya"; //string pool pointed by s4
        String s5 = new String(s4); //heap will be pointed by s5 




        // we can also pass char[] to string
        char[] arr = {'A','d','i','t','y','a',' ','t','a','n','d','o','n'};
        String s6 = new String(arr); //values[] - new arr of byte[] 
        arr[2] = 'o';
        System.out.println(s6);//immutable



        // char array subset to string
        String s7 = new String(arr,0,6);
        // [0,6) - 0 is inclusive and 6 is exclusive
        System.out.println(s7);


    //    byte array to string
        byte[]values = {97,98,99};
        String s8 = new String(values);
        System.out.println(s8);


        // stringbuilder to string
        StringBuilder sb = new StringBuilder("hello");
        String s9 = new String(sb);
        System.out.println(s9);



         // stringbuffer to string
        StringBuffer sb2 = new StringBuffer("hello");
        String s10 = new String(sb2);
        System.out.println(s10);




       










    }
    
}

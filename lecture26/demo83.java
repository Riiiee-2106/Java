public class demo83{
    public static void main(String[] args) {
        
        //constructors of string
        String s1 = new String(); //empty string
        System.out.println(s1);

        String s2 = new String("");//empty string
        System.out.println(s2);

        String s3 = new String("hello");
        System.out.println(s3);

        String s4 = "hello"; //string pool
        String s5 = new String(s4); //heap

        //char array
        char[]arr = {'a','d','i','t','y','a',' ','t','a','n','d','o','n'};
        String s6 = new String(arr); //store full length of array
        arr[0] = 'b';
        System.out.println(s6);


        String s7 = new String(arr,0,6); //[inclusive - 0 or exclusive 6] ->[0,6)


        byte[]val ={97,98,99};
        String s8 = new String(val,0,1);
        System.err.println(s8);


//Stringbuilder/Stringbuffer

StringBuilder sb = new StringBuilder("hello");
String s9 = new String(sb);

StringBuffer sb2 = new StringBuffer("world");
String s10 = new String(sb2);


            }
}
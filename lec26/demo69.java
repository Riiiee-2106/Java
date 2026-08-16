package lec26;

public class demo69 {


            //string  constructors  overload methods in java
    public static void main(String[] args) {
        String s1 = new String();
        String s2  = new String("");
        String s3 = new String("hello");

         String s4 = "aditya";
         String s5 = new String (s4);


        //  char array 
        char[]arr = {'A','D','I','T','Y','A','T','A','N','D','O','N'};

        // still immutable
        String str =new String(arr);
        String str1 = new String(arr,0,6);
        System.out.println(str1);

        // [0,6) --> 0 inclusive and 6 exclusive

        arr[0] = 'p';
        System.out.println(arr);
        System.out.println(str);



        byte[] b  = {97,98,99}; 
        String s6 = new String(b,0,2);
        System.out.println(s6);


        // StringBuilder/StringBuffer
        StringBuilder sb = new StringBuilder("hello");
        String s8 = new String(sb);


         StringBuilder sb1 = new StringBuilder("hello");
        String s9 = new String(sb1);


        System.out.println(s9);
    }


    
}

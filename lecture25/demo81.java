public class demo81{
    public static void main(String[] args) {
        
        //question1
        String s1 = "Ja"+"va";
        String s2 = "Java";
        System.out.println(s1==s2);


        //question2
        String s3 = "hello"; //string pool
        String s4 = s3+" world"; //hello world in heap  and world in string pool
        String s5 = "hello world"; //string pool hello world to be pointed
        System.out.println(s4==s5);


        String s6 = "hello";
        String s7 = s6;
        System.out.println(s6==s7);

        String s8 = "hello";
        s8 ="world";
        System.out.println(s8);

        String s9 = new String("hello"); //made in heap and string pool ,but refer to heap 
        String s10 = "hello"; //refer to string pool hello

     
}
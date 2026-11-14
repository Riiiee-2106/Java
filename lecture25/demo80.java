public class demo80{

    public static void main(String[] args) {

       String s = "Hello";
       s.concat("world"); //not referred

       System.out.println(s);//immutable

       String s2 = "Hello";
       System.out.println(s==s2);

       String s3 = new String("richa");
       String s4 = new String("richa");

       System.out.println(s3==s4);
       System.out.println(s3.equals(s4));


    }
}
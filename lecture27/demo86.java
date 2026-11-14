public class demo86{
    public static void main(String[] args) {
        
        //upcasting
        //specific value to generic value conversion

        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        //downcasting
        //generic value to specific value conversion

        Object obj2 = 10;
        // String s2 = (String)obj2;  give runtime exception -> classcastexception

        Object obj3 = "aditya";
        String s3 = (String)obj3;







    }
}
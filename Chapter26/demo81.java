package Chapter26;
public class demo81{
    public static void main(String[]args){
         // string methods ---

        //  length and emptiness 
        String name = "richa singh";
        System.out.println(name.length()); //length is a method in string
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());

        String str = "";
        System.out.println(str.isBlank()); //true
        System.out.println(str.isEmpty()); //true

        String str1 = "  ";
        System.out.println(str1.isBlank());//true
        System.out.println(str1.isEmpty()); //false


        // CHaracter access

        System.out.println(name.charAt(2));//c
        char[]arr = name.toCharArray();


        // comparison 
        String s1 = "Richa singh";
        System.out.println(name.equals(s1)); //false
        System.out.println(name.equalsIgnoreCase(s1)); //true
        System.out.println(name.compareTo(s1)); //lexicographical comparison -> integer value  ->
        
        /*

        negative value => if first str is less than sec str
        positive value => if first str is more than sec str
        0 => if no difference in first str and sec str
        
        */



        // searching

        System.out.println(name.contains("cha")); //true
        System.out.println(name.indexOf('i')); //if many same character, gives first character index


        System.out.println(name.lastIndexOf('i'));
        System.out.println(name.startsWith("Ri"));
        System.out.println(s1.endsWith("gh"));


        // Extraction/Transformation
        
        System.out.println(s1.substring(0,6));
        System.out.println(s1.toUpperCase());
        s1 = "RICHA SINGH";
        System.out.println(s1.toLowerCase());
        s1 = "                Trim                              ";
        s1 = s1.trim();

        System.out.println(s1);
        s1 = "T    RIM";
        System.out.println(s1.trim());


        // strip() is unicode friendly

        s1 = "    ALT+2325";
        System.out.println(s1.strip());

        System.out.println(name.repeat(3));

        s1 = s1.replace(s1,"richa singh");
        System.out.println(s1);

        s1 = s1.replaceAll("icha", "ichi");
        System.out.println(s1);

        String s2 = "Aditya,Rohan,Rohit";
        String [] s3 =  s2.split(":");

        for(String st :s3){
            System.out.println(st);
        }

        String s = String.join(":","aditya","rohit","rohan");
        System.out.println(s);


        // conversion
        String str2 =  new String(String.valueOf(10));  //primitive int to string

        String a = "a,b,c";
        byte b [] = a.getBytes();

        for(byte b1:b){
            System.out.print(b1+",");
        }
        System.out.println();


        // advance
        String hello = new String("hello"); //heap and string  pool,hello points to heap

        String s6 = "hello"; //s6 points to string pool 
        System.out.println(hello ==s6);

        hello = hello.intern(); //now hello points to stringpool
         System.out.println(hello ==s6);



        //  format
        String string = "Aditya";
        int age = 29;

        System.out.println("hello my name is "+string+" and age is "+age);
        System.out.println(string.format("hello my name is %s and age is %s ",string,age));



    }

}
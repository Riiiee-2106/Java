package lec26;

public class demo70 {


    // String methods 
    public static void main(String[] args) {

        String s = new String();
        String s1 = new String("");
        String s2 = new String("    ");

        // length/emptiness  gives int value
        System.out.println(s.length());
         System.out.println(s1.length());
          System.out.println(s2.length());

        //   true/false
        System.out.println(s.isBlank());
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());

        // true/false
        System.out.println(s.isEmpty());
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

// ---------------------------------------------------------------------------------------

        // Character access  - charAt,toCharArray

        String s3 = "HelloWorld";
        System.out.println(s3.charAt(2));
        System.out.println(s3.toCharArray());
        char[]arr = s3.toCharArray();
        for(char a :arr){
            System.out.println(a);
        }


// --------------------------------------------------------------------------------------

// comparison -- equals, ==,equalsIgnoreCase,compareTo
String s4 = "hello";
String s5 = new String("hello");
String s6 = "hello";
String s7 = s6;
String s8 = "HELLO";
String s9 = "abcd";
String s10 = "abcb";
String s11 = "abcd";

        //values compare  -- gives true/false
        System.out.println(s4.equals(s7));
        System.out.println(s4.equals(s6));
        System.out.println(s6.equals(s7));
        System.out.println(s5.equals(s7));

        // references compare gives true/false
        System.out.println(s4 == s6);
        System.out.println(s6==s7);
        System.out.println(s4==s7);
        System.out.println(s5==s4);


        // gives true/false
        System.out.println(s4.equalsIgnoreCase(s8));

        // compareTo --- (-ve) if num1<num2
        // (+ve)  if num1>num2
        // (0) if num1==num2

        // gives int values
        System.out.println(s9.compareTo(s10));
        System.out.println(s10.compareTo(s9));
        System.out.println(s9.compareTo(s11));


// ---------------------------------------------------------------------------

// searching --contains gives (true/false),indexOf gives (index),lastIndexOf gives(index)
// startsWith gives(true/false), endsWith  gives(true/false)

String s12 = "Aditya is a boy";
System.out.println(s12.contains("ity"));

System.out.println(s12.indexOf("ity"));

System.out.println(s12.lastIndexOf("ya"));

System.out.println(s12.startsWith("A"));

System.out.println(s12.endsWith("ya"));



// extraction/transformation ---substring(startindex(inclusive),endindex(exclusive)) -- gives(value)

// substring(startIndex)

// uppercase,lowercase

// trim -- start trim and end trim 

// stripe-- start trim and end trim  ,unicode friendly

String s13 ="hello world with java";
System.out.println(s13.substring(0, 6));
System.out.println(s13.substring(6));
System.out.println(s13.toUpperCase());
System.out.println(s13.toLowerCase());

String s14 = "       hello      ";
System.out.println(s14.trim());
System.out.println(s14.strip());


// repeat
System.out.println(s13.repeat(3));

// replace (old char replace, with new char)
// replaceAll( char passed get replaced in entire string)


System.out.println(s13.replace('i', 't'));
System.out.println(s13.replaceAll("java", "vava"));



// ---------------------------------------------------------------------------

// split and join

String s15 = "aditya,rohit,rohan";
String s16 = s15.join("-","a","b","c");
String []s17 = s15.split(",");

System.out.println(s16);

for(String s18 :s17){
    System.out.println(s18);
}



// conversion

// convert int -- string
String s19 = new String(String.valueOf(10));
System.out.println(s19);

String s20 = "aditya";

byte []b = s20.getBytes();

for(byte b1 :b){
    System.out.print(b1+",");
}



// advance method = intern ,format

String s21 = new String ("Hello");  //heap
String s22 = "Hello"; //stringpool
String s23 = s21; //heap
String s24 = s23.intern(); //s23 heap mei h stringpool mei h toh udhar point kr
System.out.println(s24 == s21);  //s24 stringpool mei, s21 heap mei -- false



// format
String name = "aditya";
int age = 28;

System.out.println(String.format("hello %s ,your age is %s",name,age));


    }
    
}

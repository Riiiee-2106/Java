
import javax.sound.sampled.SourceDataLine;

public class demo84{
    public static void main(String[] args) {
        

        String s1 = new String("Aditya");

        //length/emptiness
        System.out.println(s1.length()); //length as a method is present in strings

        String s2 = " ";
        System.out.println(s2.isBlank()); //true
        System.out.println(s2.isEmpty());//false

        //character access
        System.out.println(s1.charAt(2));

        char[]arr = s1.toCharArray();
        for(char a:arr){
            System.out.print(a+" ");
        }

        //comparison
        String s3 = "Aditya";
        System.out.println(s1.equals(s3)); //true (as equals calculate references but string overriden it to calculate value)
        System.out.println(s1==s3); //true (as == calculate references )

        String s4 = "ADITYA";
        System.out.println(s3.equalsIgnoreCase(s4)); //ignore upper or lower case only calculate equal values


        //string lexicographical comparison
        String s5 = "abc";
        String s6 = "abd";
        System.out.println(s5.compareTo(s6)); //(97,98,99 - 97,98,100) = (0,0,-1) =>-1


        //compareTo => (-ve , 0 ,+ve)values
        /*1st string lesser than 2nd string -> -ve value
        1st string equal to 2nd string -> 0 
        1st string more than 2nd string -> +ve value*/

        //searching
        System.out.println(s4.contains("TYA")); //->true
        System.out.println(s4.indexOf('T')); //3
        System.out.println(s4.indexOf("ITY"));//2 start of string
        System.out.println(s4.lastIndexOf('Y'));
       

        //extraction/tranformation
        //substring
        String str = s4.substring(0,1);
        System.out.println(str);

        //[) [ inclusive   ) excluded

        //substring is overloaded
        

        System.out.println(s3.toUpperCase());
        String s7 = "     java    ";
        System.out.println(s3.trim());//trims only starting and ending spaces not in between

        //strip method - unicode friendly 
        //trim wont work after ascii values

        System.out.println(s7.repeat(3));
        System.out.println(s7.replace('a','y'));

        System.out.println(s4.replace("ITY", "ICHA"));


        String s8 = "ADHD";
        System.out.println(s8.replaceAll("AD","AA"));

        String s9 = "Aditya,Rohit,Rohan";
        String[] s10 = s9.split("__");
        for(String s:s10){
            System.out.print(s);
        }

    System.out.println(String.join("-","a","b","c"));


    //Conversion
    String s11 = new String(String.valueOf(10)); //convert datatype to string

    //getBytes

   String s12 = "aditya";
   byte[]b  = s12.getBytes();

   for(byte b1:b){
    System.out.print(b1+","); //gives ascii values
   }   

    //Advance ------> intern(),format()
    /* String pool : "Hello"
    Heap s13 :"Hello"*/

    String s13 = new String("Hello");
    String s14 = s13; 
    System.out.println(s13==s14);//true
    String s15 = s13.intern(); //keep data in stringpool
    System.out.println(s15==s13);


    //format
    String name = "Aditya";
    int age = 14;
    System.out.println("your name is "+name+" and your age is "+age);

    //instead for more readability we can use format
    System.out.println(String.format("Hello %s ,your age is %s",name,age));


   }



    




    }

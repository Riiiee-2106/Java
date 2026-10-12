package Chapter21;

import java.util.zip.CRC32;

public class demo59 {

    public static void main(String[] args) {
       /*  Student s1 = new Student(28,"Aditya","iitb");
        System.out.println( s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getCollege());*/

        //cant even access variables
       // System.out.println(s1.name);

       College c = new College("iitg","assam");
       System.out.println(c.name);
      

       Student s2 = new Student(28,"Adi",c);
       System.out.println(s2.getCollegeName().name);
        c.name = "iitb";
       System.out.println(s2.getCollegeName().name);

    }
    
}

//not a fully immutable class   n
final class Student{
    private  final  int age;
    private  final String name;
    // private  final String college;
    private final College college;


    Student(int age,String name,/*String college*/ College college){
        this.age = age;
        this.name = name;
        this.college = college;
    }

    //getters
    public int getAge(){
        return this.age;
    }


    public String getName(){
        return this.name;
    }

    public /*String */College getCollegeName(){
        return this.college;
}

}
//cant do this class cseStd extends Student{


//mutable class
class College{
    String name;
    String address;

    College(String name,String address){
        this.name  = name;
        this.address = address;
    }

    
}

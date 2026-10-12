package Chapter21;

import java.util.zip.CRC32;

public class demo60 {

    public static void main(String[] args) {
      

        College c = new College("iitk", "kanpur");

        Student s1 = new Student(21,"richa", c);

        System.out.println(s1.getCollegeName().name);

        s1.getCollegeName().name = "iitb";
        System.out.println(s1.getCollegeName().name);

    }
    
}

//not a fully immutable class   n
final class Student{
    private  final  int age;
    private  final String name;
    // private  final String college;


    //earlier we used to give reference of college directly now 
    //instead pass reference of another object 
    //you make changes in another object not in me
    // private final College college;

    private final College college;


    Student(int age,String name,/*String college*/ College college){
        this.age = age;
        this.name = name;
        this.college = new College(college.name,college.address);
    }

    //getters
    public int getAge(){
        return this.age;
    }


    public String getName(){
        return this.name;
    }

    public /*String */College getCollegeName(){
        return new College(this.college.name, this.college.address) ;
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

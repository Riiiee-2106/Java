package lec13;

public class demo23 {

    public static void main(String[] args) {
        
    

    Student s1 = new Student();


    // very tedious to provide values
    s1.name = "richa";
    s1.rollNo = 101;
    s1.age = 21;
    s1.college = "iitg";


    // so we use constructors --- to create an object

        // default values 
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.age);
        System.out.println(s1.college);

    
    }
    
}


class Student{


    String name;
    int age;
    int rollNo;
    String college;

   
    void markAttendance(){
    System.out.println("marked attendance");
    }
}
  


package lec13;

public class demo24 {

    public static void main(String[] args) {
        
        Student s1 = new Student("richa",21,101,"iitg");

 
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


    // Student(){
    // name = "richa";
    // rollNo = 101;
    // age = 21;
    // college = "iitg";
    // }

    Student(String n ,int a,int rN,String clg){
        name = n;
        age = a;
        rollNo = rN;
        college = clg;


    }

   
    void markAttendance(){
    System.out.println("marked attendance");
    }
}
  

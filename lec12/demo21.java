package lec12;

public class demo21 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "aditya";
        s1.age = 21;
        s1.rollNo = 101;
        s1.college = "iitg";


        s1.markAttendance();
        s1.print();

        Student s2 = new Student();
        s2.name = "rohit";
        s2.age = 22;
        s2.rollNo = 102;
        s2.college = "iitg";

        s2.markAttendance();
        s2.print();

        
    }
    
}



class Student{
    String name;
    int age;
    int rollNo;
    String college;


   void markAttendance(){
    System.out.println("marked student: "+name);
   }


   void print(){
    System.out.println(name +" "+age+" "+rollNo+" "+college);
   }
}
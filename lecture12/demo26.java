package lecture12;

public class demo26{

    public static void main(String []args){
        Student s1 = new Student(); //declaration and definition of object student s1

        //giving values of s1
        s1.name = "richa";
        s1.age = 22;
        s1.rollNo = 101;
        s1.college = "iitg";

        // calling method
        s1.markAttendance();
        // calling helpful function
        s1.print();

    }
}



class Student{
    // intrinsic property of object 
    String name;
    int age;
    int rollNo;
    String college;

    // intrinsic method of object
   void markAttendance(){
    System.out.println("attendance marked by "+name);
   }

//    helpful function
    void print(){
        System.out.println(name+","+age+","+rollNo+","+college);
    }
}
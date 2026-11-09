package inheritance;
//D.) MULTIPLE INHERITANCE - 

public class demo43 {
    
    public static void main(String[] args) {
        
    }

}

/* 
A    B 
\    /
  C

  */

//class A
class Student{
    String name;
    int age;

    void markAttendance(){
        System.out.println("attendance marked");
    }
}


//class B
class Student2{

}


// class EngineeringStudent extends Student1,Student2{ child C of parent class A and B 
//     void attendLab(){
//         System.out.println("lab attended by engineering student");
//     }
// }
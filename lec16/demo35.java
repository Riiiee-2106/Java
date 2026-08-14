package lec16;

public class demo35 {

    public static void main(String[] args) {
        // inheritance
        EngineeringStudent eg = new EngineeringStudent();
        eg.markAttendance();
        eg.attendLabEng();

        Student s1 = new Student();
        s1.markAttendance();
        // s1.attendLabEng(); 

        // parent class can access its own methods 
        // while child classes can access its as well as its parent class methods

    }
    
}


/*

inheritance is  a-
parent(Superclass)
|
|
|
child(subclass)

*/


class Student{
    String name;
    int age;


    protected void markAttendance(){  //this can be public default or protected
        System.out.println("attendance marked");
    }
}

class EngineeringStudent extends Student{

    void attendLabEng(){
        System.out.println("engineering lab attended");
    }
}
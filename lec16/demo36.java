package lec16;

public class demo36 {

    // Types of inheritance
    // simple inheritance
    // mutli - level inheritance
    // hierearchical inheritance
    // multiple inheritance (not supported in java)


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.markAttendance();

        EngineeringStudent eg = new EngineeringStudent();
        eg.markAttendance();
        eg.attendLabEng();
    }
    
}


// example of simple inheritance

class Student{  //parent class
    String name;
    int age;


    protected void markAttendance(){  //this can be public default or protected
        System.out.println("attendance marked");
    }
}

class EngineeringStudent extends Student{ //child class

    void attendLabEng(){
        System.out.println("engineering lab attended");
    }
}

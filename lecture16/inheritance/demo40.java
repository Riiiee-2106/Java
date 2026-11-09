public class demo40{
    public static void main(String []args){
        EngineeringStudent eg = new EngineeringStudent();
        //child class can call its own and as well as parent class method and variable
        eg.markAttendance();
        eg.attendLab();


        Student s1 = new Student();
        s1.markAttendance();
        //parent class can call only its own methods and variables
        //s1.attendLab();
    }
}

class Student{  //parent class is also known as superclass
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student{ //child class is also known as subclass
    void attendLab(){
        System.out.println("lab attended");

    }
}

/*type of inheritance - 
A) SIMPLE INHERITANCE
parent class
    |
    |
    |
    v
child class relation */
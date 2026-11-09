package inheritance;

/*types of inheritance - 
B) MULTI-LEVEL INHERITANCE 
A (PARENT OF B CLASS)
|
V
B (PARENT OF C CLASS AND CHILD OF B CLASS)
|
V
C (C IS CHILD OF B CLASS)

*/

public class demo41 {

    public static void main(String[] args) {
        CseEngineeringStudent cse = new CseEngineeringStudent();
        cse.markAttendance();
        cse.attendLab();
        cse.cseLab();
        
    }
    
}


class Student{  //parent class can call all its own  method and variables
    String name;
    int age;

    public void markAttendance(){
        System.out.println("Attendance marked");
    }
}


class EngineeringStudent extends Student{  //it can call its parent class and its own methods and variables

    void attendLab(){
        System.out.println("attend engineering lab");
    }

}

class CseEngineeringStudent extends EngineeringStudent{ //can call all superclasses and subclasses methods and variables
    void cseLab(){
        System.out.println("attend cse engineering lab");
    }
}
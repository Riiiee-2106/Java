package lec16;

public class demo37 {

    public static void main(String[] args) {

        CseEngineeringStudent cEg = new CseEngineeringStudent();
        cEg.markAttendance();
        cEg.attendLabEng();
        cEg.cseLabAttend();
        
    }
    
}
// multi-level inheritance

// A(parent of B) --- B(parent of C)(child of A) ----C(child of B)


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


class CseEngineeringStudent extends EngineeringStudent{  

    void cseLabAttend(){
        System.out.println("cse lab attended");
    }
}
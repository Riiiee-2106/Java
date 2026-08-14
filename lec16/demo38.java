package lec16;

public class demo38 {

    public static void main(String[] args) {

        MedicalStd md = new MedicalStd();
        md.markAttendance();
        md.medAttendLab();
        
    }
    
}

// hierarchichal inheritance
// A ----B
// |
// |
// C

// A is parent of both B and C

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


class MedicalStd extends Student{  //child class
    void medAttendLab(){

    }
}


/*

multiple inheritance
A    B
\    /
 \ /
  C
 
not supported in java

 */
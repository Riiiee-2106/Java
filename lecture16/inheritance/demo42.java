package inheritance;

/*types of inheritance - 
C) HIERARCHICAL INERITANCE 

    A(SUPER CLASS)
   / \
  B   C (CHILD CLASSES)
  
  */



public class demo42 {
    public static void main(String[] args) {


        
    }
    
}


class Student{ //can call only its own methods and variables
    String name;
    int age;

    void attendance(){
        System.out.println("attendance marked");

    }

    
}

class EngineeringStudent extends Student{ //can call all parent class and its own class methods and variables
    void attendEngLab(){
        System.out.println("attend engineering lab");
    }
}

class MedicalStudent extends Student{ //can call all parent class and its own class methods and variables
    void attendMedLab(){
        System.out.println("attend medical lab");
    }
}


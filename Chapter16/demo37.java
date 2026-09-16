package Chapter16;

// inheritance
public class demo37 {


    public static void main(String[] args) {
        
        EngineeringStd eg = new EngineeringStd();
        eg.markAttendance();//we can call parent class method from child class
        eg.attendLab();

        Student s = new Student();
        s.markAttendance();
        //we cannot call child class methods in parent class object
    }
    
}
 

/*

parent class -- super class

child class -- subclass 

*/

class Student{
        String name;
        int age;

        protected  void markAttendance(){ //either default ,public,protected but not protected
            System.out.println("attendance marked  by student");
        }
    }



class EngineeringStd extends Student{
    void attendLab(){
        System.out.println("engineering student attends lab");
    }
}




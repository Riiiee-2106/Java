package Chapter16;

//types of inheritance
/*

simple inheritance
multilevel inheritance
hierarchial inheritance
multiple inheritance(not supported in java) 

*/

public class demo38 {
    
    public static void main(String[] args) {
        

    }
}

// simple inheritance


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







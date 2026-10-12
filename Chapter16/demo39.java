package Chapter16;

public class demo39 {


    public static void main(String[] args) {
        //multi level inheritance

        CseStd cs= new CseStd();
        cs.markAttendance();
        cs.attendLab();
        cs.attendCseLab();
    }

    
}





//A(PARENT OF B)--->B(CHILD OF A BUT PARENT OF C)--->C(CHILD OF B) 



class Student{
        String name;
        int age;

        protected  void markAttendance(){ //either default ,public,protected but not protected
            System.out.println("attendance marked  by student");
        }
    }



class EngineeringStd extends Student{
    void attendLab(){
        System.out.println("engineering student attends eng lab");
    }
}


class CseStd extends EngineeringStd{
    void attendCseLab(){
        System.out.println("engineering student attends cse lab");
    }
        }



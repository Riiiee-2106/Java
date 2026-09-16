package Chapter16;

public class demo40 {






    public static void main(String[] args) {
        //hierarchial inheritance

        MedStd med= new MedStd();
        med.markAttendance();
        med.attendMedLab();
      
    }

    
}





//A(PARENT OF B)(PARENT OF C)--->B(CHILD OF A )--->C(CHILD OF A) 



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


class MedStd extends Student{
    void attendMedLab(){
        System.out.println("engineering student attends med lab");
    }
        }



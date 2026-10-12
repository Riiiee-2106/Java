package Chapter13;

public class demo26 {

    public static void main(String[] args) {
        
        Student s1 = new Student(); //4. default constructor

        System.out.println(s1.name); //null
        System.out.println(s1.rollNumber); // 0
        System.out.println(s1.age); //0
        System.out.println(s1.college); //null


        System.out.println();


        //5. parameterized constructor
        Student s2 = new Student("richa",18,101,"iitg");
        
        System.out.println(s2.name); 
        System.out.println(s2.rollNumber); 
        System.out.println(s2.age); 
        System.out.println(s2.college); 


    }
    
}



class Student{

    String name;
    int age;
    int rollNumber;
    String college;


    //3. constructor overload  

    //6. if made only parameterized constructor and try object creation with default values - it wont work
   

    Student(){  //1. --default constructor

    }

    Student(String n,int a,int rN,String c){  //2. parameterized constructor 
        name = n;
        age = a;
        rollNumber = rN;
        college  =c;
    }


    void markAttendance(){
        System.out.println("Attendance marked for student "+name);
    }
}
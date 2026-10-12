package Chapter15;

public class demo32 {


    public static void main(String[] args) {

        // Student s1 = new Student("aditya", 21, 101, Student.college);

        Student s1 = new Student("aditya", 21, 101);

        Student.college = "iitg";
       // System.out.println(s1.college);
       System.out.println(s1.name+" "+s1.rollNumber+" "+s1.age+" "+Student.college);




        
    }
    
}


class Student{
    String name;
    int age;
    int rollNumber;
    static String college; //either i can put static variable value here only 
    //static String college = "iitg";



    //we can also assign static variable value through static block
    static{
        college = "iitk";
    }

    Student(String name,int age,int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        //this.college = college;  //warning 
    }
}
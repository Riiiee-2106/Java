package lecture15;

public class demo34 {

    public static void main(String[] args) {
        //1.static keyword

        //3.either pass static field value in constructor while object creation
      //  4. Student s1 = new Student("richa", 21, 101, "iitg");

      Student s1 = new Student("richa", 21, 101);

        //5. or with className 
       // 6. 
       Student.college = "iitg";

       System.out.println(s1.name+" ,"+s1.age+","+s1.rollNumber+","+Student.college);
    }
    
}



class Student{
    String name;
    int age;
    int rollNumber;
    static String college;
    // static String college = "iitg";
    static int grade;

    Student(String name,int age,int rollNumber/* ,String college*/){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
       //2. this.college = college; access in a static way

    }

    //static block - keeps all static variables or methods
    static{
        college = "iitg";
        grade = 'A';
    }


    /*before object creation - all static variables ,block ,methods get executed */
}
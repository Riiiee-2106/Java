package Chapter12;

public class demo24 {

    public static void main(String[] args) {

        //6. object declaration occurs within main - as flow of execution starts from main.
        // 7. memory allocation of class student will happen from main


        Student s1 = new Student();

        s1.name = "richa";
        s1.age = 21;
        s1.rollNumber = 101;
        s1.college = "iitg";


        Student s2 = new Student();

        s2.name = "utkarsh";
        s2.age = 22;
        s2.rollNumber = 102;
        s2.college = "iitk";

        s1.markAttendance();
        s1.print();
        System.out.println();
        s2.markAttendance();
        s2.print();
        
    }
    
}


//1.  class are declared outside of main function and public class
class Student{ // 2. blueprint of how an object will look like - or what are the behaviours and characteristics it hold

    // 3. characteristics of object
    String name;
    int age;
    int rollNumber;
    String college;



    //  4. behaviours are also declared as an intrinsic nature of object in class - so it can access all its variables without passing it within parameter
    void markAttendance(){
        System.out.println("attendance marked by : "+name);
    }

    // 5. helping function
    void print(){
        System.out.println(name+" ,"+age+" ,"+rollNumber+" ,"+college);
    }
}




/* 8. public class demo24{ ---->  this is a class

public static void main(String[]args){ ---->function in class


}

}

9. java is almost purely /completely object oriented programming


10. because whenver you're required to write code in java , you have to make a class and define variables or function within it

*/

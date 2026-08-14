package lec15;

public class demo30 {

    public static void main(String[] args) {
        Student s1 = new Student("adi", 21,101);
        // Student.college = "IIt"; // either assign static fields like this - 1
        
        System.out.println(s1.name+" "+s1.age+" "+s1.rollNo);
        // System.out.println(s1.college);
        System.out.println(Student.college); //this is preferred
    }
    
}


class Student{
    String name;
    int age;
    int rollNo;
    // static String college = "iit";  or directly assign value here --2
    static String college;

    Student(String name,int age ,int rollNo){
        this.name =  name;
        this.age = age;
        this.rollNo = rollNo;
        // this.college = college; // want us to assign as in static way
        // college = college //this also gives warning
    }

        // or assign static variable using static block
        static{
            college = "iit";
        }
    }




    // why main is static

// as without static main will be
// called as demo31 d1= new demo31(); --> we had to make an abject of class demo31
// and then call main by d1.main() --> through its object 


// static makes it easier by  --- simply writing className.variable/method

// demo31.main()

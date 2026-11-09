package inheritance;

public class demo44 {

    public static void main(String[] args) {
        // EngineeringStudent es1 = new EngineeringStudent();
        // es1.print();

       
        EngineeringStudent es1 = new EngineeringStudent("richa",21,101,"iitg");
        es1.print();
        
        
    }
    
}


class Student{
    String name;
    int age;
    int rollNo;
    String college;

    void print(){
        System.out.println(name+" "+age+" "+rollNo+" "+college);
    }

    //3. super keyword can give access to constructors
    Student(){

    }

    Student(String name,int age,int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
    }



}


class EngineeringStudent extends Student{
    String college;

     EngineeringStudent(String name,int age,int rollNo,String college){
            super(name,age,rollNo,college);
            this.college  = college;
        }


    void print(){

        //1. super - can give access to variable of parent class
        //if name of variables in parent and child class are different then we dont need to write super
        // System.out.println(name+" "+age+" "+rollNo+" "+super.college);


        //2. super can give access to methods of parent class
        super.print();
        System.out.println(college);

       

    }
}
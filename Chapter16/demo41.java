package Chapter16;

public class demo41 {

    public static void main(String[] args) {
        
        EngStd eg = new EngStd("richa",21,101,"iitg");
        eg.print();

        

    }
    
}


class Student{
    String name;
    int age;
    int rollNumber;
   
    Student(String name,int age,int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    void print(){
        System.out.println(name+" "+age+" "+rollNumber);
    }


}
class EngStd extends Student{
    String college;

    // void print(){
    //     //if no name of variable are same in parent and subclass then to apply super is not mandatory
    //     System.out.println(name+" "+age+" "+rollNumber+" "+college);
    // }

    EngStd (String name,int age,int rollNumber,String college){
        super(name,age,rollNumber);
    this.college = college;
}


void print(){
    super.print();
    System.out.println(college);


}




}
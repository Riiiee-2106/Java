package lecture16;

public class demo38 {



    
}


class Student{
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    Student(String name,int rollNumber,int age,String college){
        this.name = name;
        this.rollNumber =rollNumber;
        this.age = age;
        this.college = college;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setCollege(String college){
        // if college = "abc"
        //we will put validations here - 
        // if collegeName is in list  - add it ,otherwise don't add
        this.college = college;
    }

}

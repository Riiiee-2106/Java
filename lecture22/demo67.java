import java.util.Objects;

public class demo67{
    public static void main(String[]args)throws CloneNotSupportedException{

        Student s1 = new Student();
        s1.name = "richa";
        s1.age = 21;

        // System.out.println(s1.toString()); will print hexcode
        System.out.println(s1); //println function internally uses toString

        Student s2 = new Student();
        s2.name = "richa";
        s2.age = 21;

        System.out.println(s1.equals(s2));
         System.out.println(s1.hashCode() == s2.hashCode());

         System.out.println(s1.getClass().getName());

         Student s3 = (Student)s1.clone();
         System.out.println(s3.name);


    }
}

class Student extends Object implements Cloneable{
    String name;
    int age;


     @Override 
    protected  Object clone()throws CloneNotSupportedException {
        return super.clone();

    }
    
    @Override
    public String toString(){
        return (name+" "+age);
    }

    @Override
    public boolean equals(Object obj){

        if(this==obj){
            return true;
        }

        if(obj==null){ //nullpointer exception avoided
            return false;
        }

        if(obj.getClass() != this.getClass()){ //classcastexception avoided
            return false;
        }

    Student s = (Student)obj;

    return (this.name == s.name && this.age==s.age);

    }


    @Override 
    public int hashCode(){
       /*  int res = 17;
        res = 17*31+age;
        //if name == null , may give nullpointerexception 
        res = res*31+((name==null)?0:name.hashCode());

        return res;*/

        return Objects.hash(name,age);
    }


   


}
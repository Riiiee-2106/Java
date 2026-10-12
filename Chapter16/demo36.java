package Chapter16;
import  Chapter16.packages.college.Teacher;
// import  packages.school.Teacher; -- cant import same file name from different modules


//we need to import files from same module or different to use its function or variables

//import packageName.className


//we can accesss all files from package
import Chapter16.packages.school.*;







public class demo36 {


    public static void main(String[] args) {
        
    
    Teacher t1 = new Teacher();
    t1.print();

    //to access same file from different packages 
    //we can also write it like

      Chapter16.packages.school.Teacher t2 = new Chapter16.packages.school.Teacher(); //this is only true - if these packages is in same module

      t2.print();







    
}

}
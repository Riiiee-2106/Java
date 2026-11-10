public class demo51{
    public static void main(String[]args){

    }
}

//why one public class per file - 
/*so that jvm directly goes to main which is present within that public class , and main is static so that jvm can call main with classname and public so tht everyone can access it.

if multiple classes are present and each one is public than jvm will get confused which public class have main*/


//why name of that public class is same as filename - 
/*jvm directly goes to filename and  load filename.main() 


if package have multiple files , but one file will still have main which we will run*/
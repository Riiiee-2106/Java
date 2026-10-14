package lecture7;

public class demo12 {

    public static void main(String[] args) {
   

    //SELECTION STATEMENT - 

    // if else if ladder

    // can check multiple expression

    int i = 5;

    // until find expression true ,we check every statement . if found one statement correct no other will get executed


    if(i==1){
        System.out.println("i is 1");
    }
     if(i==2){
        System.out.println("i is 2");
    }
     if(i==3){
        System.out.println("i is 3");
    }
     if(i==4){
        System.out.println("i is 4");
    }
     else{
        System.out.println("i is 5");
    }




    // difference in if statement and if else if ladder


    // if evaluate every expression and prints all true statement


    System.out.println("if statement");
    
    int age = 50;
    if(age>60){
        System.out.println(" old ");
    }
     if(age>50){
        System.out.println("getting old ");
    }
     if(age>40){
        System.out.println("adult");
    }
     if(age>30){
        System.out.println("millenial ");
    }
    if(age>20){
        System.out.println("genz");
    }
    else{
        System.out.println("genz alpha");
    }
    

    System.out.println("if else if ladder");

    // if one condition gets fulfilled no other conditions get executed

     age = 50;
    if(age>60){
        System.out.println(" old ");
    }
    else if(age>50){
        System.out.println("getting old ");
    }
    else if(age>40){
        System.out.println("adult");
    }
    else if(age>30){
        System.out.println("millenial ");
    }
    else if(age>20){
        System.out.println("genz");
    }
    else{
        System.out.println("genz alpha");
    }
}

}
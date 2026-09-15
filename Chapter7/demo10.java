package Chapter7;

public class demo10 {

    public static void main(String[] args) {
        // selection statement 
        // normal if

        int i = 5;

        if(i==5){
            System.out.println("i is 5");
        }
        System.out.println("i is 5 or not,this statement gets executed");

    

    // if else
    int i1 = 10;
    if(i1==5){
        System.out.println("i1 is 5");
    }
    else{
        System.out.println("i1 is 10");
    }



    // we can also write logical statements
    if(i<10 && i>1){
        System.out.println("i lies between 1 to 10");
    }else{
        System.out.println("i is greater than 10");
    }


    // PROGRAM - number is odd or even

    int num = 10;
    if(num %2 == 0){
        System.out.println("num is even");
    }else{
        System.out.println("num is odd");
    }


    // curly brackets are optional -- but good coding practice is to apply curly brackets
    int num1 = 9;
    if(num1==9)
        System.out.println("num1 is 9");
    else
        System.out.println("num1 can be any number");


    // Nested if's
    // i=8
    if(i>5)
        {
        if(i<10){
            System.out.println("i is greater than 5 but less than 10");
            if(i==8){
                System.out.println("i is 8");
            }
        }
        else{
            System.out.println("i is greater than 5 but greater than 10");
        }
    }
    else{
        System.out.println("i is less than 5");
    }
    

    // we can have many nested if's
    // good coding practice is to not use more than 2 nested if's


    // instead of many layers of nested if's
    // we should use logical expressions

    if(i>5 && i<10){
        System.out.println("i is greater than 5 and less than 10");
    }



    // if else if ladder

    // it works on multiple choice

    if(i==5){
        System.out.println("i is 5");
    }
    else if(i==6){
        System.out.println("i is 6");
    }
    else if(i==7){
        System.out.println("i is 7");
    }
    else if(i==8){
        System.out.println("i is 8");
    }else if(i==9){
        System.out.println("i is 9");
    }else{
        System.out.println("i is 10");
    }
    
    // it will start executing from top and even if one statement gets correct we wont check further - if else if ladder

    // if - we keep on checking untill all correct statement gets covered

    // example 

    // if else if - executes till correct statement

    int age = 50;
    if(age>80){
        System.out.println("you re very old");
    }
    else if(age>60){
        System.out.println("you re becoming very old");
    }
    else if(age>45){
        System.out.println("you are middle aged  ");
    }
    else if(age>30){
        System.out.println(" you re early middle aged");
    }
    else if(age>20){
        System.out.println("genz");
    }else{
        System.out.println("genz alpha");
    }


    // if prints multiple correct statements - so it executes every statement

     age = 50;
    if(age>80){
        System.out.println("you re very old");
    }
     if(age>60){
        System.out.println("you re becoming very old");
    }
     if(age>45){
        System.out.println("you are middle aged  ");
    }
     if(age>30){
        System.out.println("you re early middle aged");
    }
     if(age>20){
        System.out.println("genz");
    }else{
        System.out.println("genz alpha");
    }


}

}
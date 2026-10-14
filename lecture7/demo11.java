package lecture7;

public class demo11 {

    public static void main(String[] args) {

        // SELECTION STATEMENTS
        //if statement

        int num1 = 5;


    // if syntax-

      /*   if(expression evaluate){
      if expression is true,execute this
      }
      */


    //   example of if statement
    // 1.
      if(num1==5){
        System.out.println("i is 5");
      }
      System.out.println("continuing the code flow ");
        
    


    //2. using logical operator
    if(num1 >=5 && num1<=10){
        System.out.println("i is between 5 to 10");
    } 


    // 3. odd or even
    int num = 10;
    if(num%2==0){
        System.out.println("num is even");
    }



    /* if else-

    if(expression evaluate){
    if true ,execute this
    }
    else{
        do this
    } 
        */


    //ex = odd or even
    if(num%2==0){
        System.out.println("num is even");
    }else{
        System.out.println("num is odd");
    }



    /*Nested if else- 

    if(expression){
    do this
        if(expression){
        do this
        }
        else{
        do this
        }
    }
    else{
        do this
    }
    


    we can go to many nested if else but we avoid it because of readability .
    
    */


    //ex= 

    int num2 = 10;
    if(num2<=10){
        if(num2<5){
            System.out.println("number is less than 5");
        }else{
            System.out.println("number is greater than 5");
        }
    }
    else{
        System.out.println("number is greater than 10 ");

    }

    // we can avoid above condition - by using logical operators

    if(num2>=5 &&num2<=10){
        System.out.println("num2 is between 5 to 10");
    }else{
        System.out.println("number is either lesser than 5 or greater than 10");
    }


    
}
}

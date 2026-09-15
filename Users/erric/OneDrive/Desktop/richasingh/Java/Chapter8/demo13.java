package Chapter8;

public class demo13 {

    public static void main(String[] args) {
        
    

    //loops


    //this is very tedious process
    //1 to 10 print

     // int i = 1;
    // System.out.println(i);
    // i++;
    // System.out.println(i);
    // i++;
    // System.out.println(i);



    //here comes the use of loops


    //while loop

    /*
    while(condition){
    do something
     updation
         }
     */

    int i=1;

    while(i<=10){
        System.out.println(i);
        i++;
    }


    // infinite loop - if not updated
    // while(i<=10){
    //     System.out.println(i);
    // }


    //we can also write while without curly brackets - but it will be infinite loop 
    // while(expression)
        //do something
        //this updation condition won't be considered



        // we can write while loop as  - expression with updation condition
        i=0;
        while(i++<=9)
            System.out.println(i);

        //while first check condition and then do work

}
    
}

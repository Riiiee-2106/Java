
public class demo15 {

    public static void main(String[]args){
        //print 1 to 10


        // print using while loop -
        /*syntax -

        while(expression is true go inside the block){
        do something
        updation
         } 
        */

        int i= 1;
        while(i<11){
            System.out.println(i);
            i++;
        }


/* 

        // in while if you dont give curly bracket  - the updation condition is not treated as a part of code
        int num = 1;
        while(num<=10)
            System.out.println(num);
        num++; //this wont be treated as a part of code - for treating it as a part of code apply curly bracket

        */

        
        
        // print i2 from 10 to 1-
        int i2 = 10;
        while(i2>=1){
            System.out.println(i2);
            i2--;
        }


        //we can do updation in expression evaluation as well-
        int num1 = 11;
        while(num1-->1){
            System.out.println(num1);
        }


        
    }
    
}

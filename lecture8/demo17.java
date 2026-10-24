public class demo17 {

    public static void main(String[] args) {
        //for loop

        /*syntax for - for loop
        
        print 1 to 10 
        
        for(initialize;condition;updation){
        do something
        }
        
    */

        //print 1 to 10
        for(int i = 1;i<=10;i++){
            System.out.println(i);
        }


        //we can also go from 10 to 1
        for(int i=10;i>=1/*boolean evaluation - true/false */;i--){
            System.out.println(i);
        }

        /*
        flow of control of for statement - 
        1. first assignment statement is executed (variable definition)
        2. then second conditional statement is evaluated.(true/false)
        3. if true,control flow will evaluate the body of the loop.
        4. once loop body is finished,control flow willl go back to the for statement,and third increment
        5. again, conditional statement is evaluated
        6.repeat 2-5
         */


        //for-each loop --> we will learn about it later

    }
    
}

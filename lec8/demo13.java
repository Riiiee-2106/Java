package lec8;

public class demo13 {
    public static void main(String[] args) {
        
        // loops

         int i=1; //1 to 10
         System.out.println(i);
         i++;
         System.out.println(i);
         i++;
         System.out.println(i);  //---- very inefficient


        //  loops - while

        int num = 1;
        /*while(expression) -- checks if expression is true or false{
            some execution
            updation
        }*/

            // 1 to 10

            while(num<=10){
                System.out.println(num);
                num++;
            }


            num = 10;
            // similarly we can do 10-1
            while(num>=1){
                System.out.println(num);
                num--;
            }

            // we can write updating condition in expression 

            num = 0;
            while(num++<10){
                System.out.println(num);
            }


            // do -while
            // do{
            //     execute this
            // }while(expression evaluate)

            //     do something then evaluation condition


            String name = "richa";
            do{
                System.out.println("hi your name is "+name);

            }while(name.equals("asim"));



            // used case of do while
            // menu item selection 
            /*
            Play game
            return saved game
            exit 
             */




            // for loop
            /* for(initialize;condition evaluation;updation){
            something execution
            }*/

            for(int i1=1;i1<=10;i1++){  //boolean -> true /false
                System.out.println(i1);
            }


            // flow of control of for
            /*
            1.first assignment statement is executed (variable definition).
            2.then second conditional statement is evaluated .(true/false).
            3.if true, control flow will evaluate the body of the loop.
            4.once loop body is finished , control flow will go back to the for statement, and third statement updation will be evaluated.
            5.again conditional statement will be evaluated.
            6. continue repeatition of 2-5 flow
             */


            // will study for each later

    }
    
}

public class demo18 {
    
    public static void main(String[] args) {
        
   /*  infinite flows conditions - 

    int i=5;
    while(i<10){

    }
    System.out.println("hello");

    
    for(int i=1;i<10;){
     System.out.println("hello");
    }

    for(int i=1; ;i++){
     System.out.println("hello");
    }

    for(  ; ;i++){
     System.out.println("hello");
    }

    for(  ; ; ){
     System.out.println("hello");
    }


    comma separated variation- 
    for(int i = 1,j=1;i<10;i++,j+=2){
      System.out.println(i*j);
    } //condition cannot be comma seperated 


    for(int i=1,j=1;i<10 && j<5;i++,j+=2){
        System.out.println(i*j);
    } //condition can be seperated by logical operator


        we can also pass boolean condition in condition of loop-

        boolean b = true;
        for(int i=1;b==true;i++){
            do something
        }


        Integer ->  byte,short,int,long
        here also we do type promotions - byte,short is also converted to int .
        so loops work on int and long

    */


        //Nested loops
        for(int i=1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }



        // jump statements - break,continue

        for(int i = 1;i<=10;i++){
            for(int j =1;j<=10;j++){
                  if(j==6){
                break;
            }
                System.out.print('*');
               
            }
            if(i==6){
                break;
            }
            System.out.println();
           
        }


        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=10;j++){
                if(j==6){
                    continue;
                }
                System.out.print('*');
            }
            System.out.println();
        }
    

    //whether a number is prime or not
    int p = 11;
    int div;
    for( div = 2;div<p;div++){
        if(p%div==0){
            System.out.println("number is not prime");
            break; //break all iterations left
        }
    }

 if((p==div)){
    System.out.println("number is prime");
}


for(int i=1;i<=10;i++){
    if(i%2==0){
        continue; //skip this iteration go to next iteration
    }
    System.out.print(i+" ");
}


// labels - we can name outer and inner loops
 outer:for(int i = 1;i<=5;i++){
            inner:for(int j = 1;j<=10;j++){
                if(j==6){
                    continue inner;
                }
                System.out.print('*');
            }
            System.out.println();
        }


        //we can also name all code block without any iteration statement or conditional statement

        first:{
            second:{
                third:{
                    System.out.println("hello");
                    break third;
                }
            }
        }

    
    }
}
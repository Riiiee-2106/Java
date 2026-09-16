package Chapter8;

public class demo16 {

    //infinite loop discussion

    public static void main(String[] args) {
        
    


    int i1 = 5;

    //while loop -- infinite

    /* 
     while(i<10){
        
     }   
     System.out.println(i);

     */


     /*
     for infinite loop
     for (int i=10;i<10;){
        System.out.println(i);
     }
        */

    

    /*
    for(int i=1; ;i++){
        System.out.println(i);
    }
        */



   /*  
   for( ; ;i++){
        System.out.println(i);
    }
        */


    /*
    for( ; ; ){
        System.out.println("hello");
    }
        */


    //comma seperated variation
    for(int i=1,j = 10;i<=10;i++){
        System.out.println(i+j);
    }
    //we cant do conditional with comma seperated

    //we need to write conditional with logical operators

    for(int x=10,y = 5;x<=10 &&y<=10;x++,y+=2){
        System.out.println(x+y);
    }



    //so condition in a loop can be false as well
    boolean b = true;
    for(int i=1;b==true;i++){
        System.out.println("richa");
        if(b==true){
            b=false;
        }
    }




    //why int datatype mostly in loops are used?? - most application can run with loops of datatype - short, long --> but we work on type promotions in java loops

    //so type promote to only int and long(if exceeds int range)


     for(int x=10;x<=10;x++){
        System.out.println(x);
    }






    //nested loops - 

    /*


    **********
    *********
    ********
    *******
    ******
    *****
    ****
    ***
    **
    *
    
    */
    for(int i=1;i<=10;i++){
        for(int j = i;j<=10;j++){
        System.out.print('*');
    }System.out.println();
}System.out.println();


/*

*
**
***
****
*****

*/

for(int i =1;i<=5;i++){
    for(int j =1;j<=i;j++){
        System.out.print('*');
    }
    System.out.println();
}
System.out.println();



//Jump statements
// break,continue

for(int n1 = 1;n1<=10;n1++){
    if(n1 == 5){
        break;
    }
    System.out.println(n1);
}




for(int n1 = 1;n1<=10;n1++){
    if(n1 == 5){
        continue;
    }
    System.out.println(n1);
}



//tell me whether the number is prime or not

int num  = 3;
int div;
for( div = 2 ;div<num;div++){
    if(num%div==0){
        System.out.println("number is not  prime");
          break;
    }
}
if(div == num){
    System.out.println("num is prime");

}




for(int i=1;i<=10;i++){
    if(i%2==0){
        continue;
    }
    System.out.println(i);
}




//we can use break and continue in nested loops - we also have labels in loops
//identifier for outer or inner loops - labels

outer: for(int i = 1;i<=10;i++){
    inner: for(int j = 1;j<=i;j++){
        
      
        if(j>5){
            break inner;
        }
        if(i>5){
            continue outer;
        }
          System.out.print("*");

    }
   
    System.out.println();
}
System.out.println();



//code block without loop or selection statements can be used

first:{
    second:{
        third:{
            System.out.println("hello");
            break first;
        }
    }
}





}
    
}


package Chapter6;

public class demo6 {

    public static void main(String[] args) {
        //arithmetic operators --- (+,-,*,/,%,+=,-=,*=,/=,%=)


        int n1 = 10;
        int n2 = 5;

        System.out.println("addition: "+(n1+n2));
        System.out.println("subtraction: "+(n1-n2));
        System.out.println("multiplication: "+(n1*n2));
        System.out.println("division: "+(n1/n2));
        System.out.println("modulus: "+(n1%n2));


        // similarly we have shortcut for all above operations

        // say we have n3 = 10 ---> n3 = 10+1  -->shortcut - n3+=1

        // n3 = 10 +2  --- add 10 and 2 , and assign right side value to left side


        int n3 = 10;
        System.out.println(n3);
        n3+=1; //11
        System.out.println(n3);
        n3-=1; //10
        System.out.println(n3);
        n3*=10; //100
        System.out.println(n3);
        n3/=2; //50
        System.out.println(n3);
        n3%=3; //2
        System.out.println(n3);



        // increment and decrement operator

        // increment -- post increment and pre increment
        // decrement -- post decrement and pre decrement

        int n4 = 10;
        n4++; // n4++ is shortcut of n4+=1 , n4+=1 is shortcut of  n4=n4+1  
        // increment n4 by one

        System.out.println(n4);

        n4-- ; //n4-- is shortcut of n4-=1 , n4-=1 is shortcut of n4 = n4-1


        // there is post and pre increment , post and pre decrement --> for ++ and --


        int n5 = 10;
        n5++; //post increment
        ++n5; //pre increment

        n5--; //post decrement
        --n5; //pre decrement

        System.out.println(" -----------------------------------");
        // how are they different from each other

        int num = 10;
        int num2 = num++; //10
        System.out.println(num2); //first assign the original value of num in num2 //10
        System.out.println(num); //then increment the value by one //11


        int num3 = ++num;
        System.out.println(num3); //first increment and assign the incremented value in num3 --- 12
        System.out.println(num3); //incremented value -- 12


        // decrement
        int num4 = 100;
        int num5 = num4--; 
        System.out.println(num5);//100
        System.out.println(num4);//99

        int num6 = 50;
        int num7 = --num6;
        System.out.println(num6); //49
        System.out.println(num7);//49




    }
    
}

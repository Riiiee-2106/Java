package lecture6;
public class demo6 {

    public static void main(String[] args) {
        // operators in java

        // ARITHMETIC OPERATORS --> (+,-,*,/,%,+=,-=,*=,/=,%=,++,--)

        int num1 = 10;
        int num2 = 5;

        System.out.println("addition: "+(num1+num2));
        System.out.println("subtraction: "+(num1-num2));
        System.out.println("multiplication: "+(num1*num2));
        System.out.println("division: "+(num1/num2));
        System.out.println("modulus: "+(num1%num2));

         num2 = num2 +3; //if we can assign new value in already existing variable.

        //  we can also assign value like
        System.out.println(num2+=3);
        int num3 = 1;
        System.out.println(num3+=1);  //do calculation on rhs to put value back in left side variable
        System.out.println(num3-=1);
        System.out.println(num3*=5);
        System.out.println(num3/=5);
        System.out.println(num3%=5);


        // post increment and post decrement 
        // pre increment and pre decrement

        int num4 = 5; 
        num4++; //this can be written as - num4 = num4+1 or num4+=1  (post increment)


        // example to understand post and pre incremental and decremental

        int num5 = 10;

        // postfix increment
        int num6 = num5++;  //10  --> first assign the already passed value and then increase it
        System.out.println(num5); //11 
        System.out.println(num6); //10

        // prefix increment
        int num7 = ++num5;  //12  -->increase the value and then pass
        System.out.println(num7);//12
        System.out.println(num5);//12


        

    }
    
}

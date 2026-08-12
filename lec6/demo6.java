package lec6;

public class demo6 {
    public static void main(String[] args) {
        
    

    // Operators in java
    // Arithmetic operators
    // (+,-,*,/,%,+=,-=,/=,%=,++,--)

    int a = 5;
    int b = 10;

    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(b/a);
    System.out.println(a%b);

    int h = 5;
    h = h+5;  //if this is ok in cse then  -- 10
    // 
    System.out.println(h);
    h+=5; //this is also correct
    System.out.println(h); //15
    // similarly, we can do
    h-=5;
    // assigning right value to variable on left side
     System.out.println(h); //10

    h*=5;
   System.out.println(h); //50
    h/=5;
   System.out.println(h); //10
    h%=2;
    System.out.println(h); //0


    // increment - post and pre increment
    // decrement - post and pre decrement


    int i = 6;
    i++; //i= i+1 // i+=1

    System.out.println(i); //-- 7
    i--;
    System.out.println(i); //-- 6

    ++i;
    System.out.println(i); //-- 7

    --i;
    System.out.println(i); //-- 6

    // prefix ,postfix increment
    // prefix,postfix decrement

    int j =7;
    j++;
    ++j;

    int k = j++; //postfix  -- assign and then increase value

    // there is no **,//,%% 
    System.out.println(k); //first put same value of j which is 9
    System.out.println(j); //increased value of j by 1 and put it here - 10

    int l= ++j; //prefix -- increase and then assign value

    System.out.println(l); //first increase j value by 1 and put it in l - 11
    System.out.println(j); //put same increased value of j - 11



    
}
}

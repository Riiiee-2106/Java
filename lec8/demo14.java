package lec8;

/**
 * Demo14 - Understanding Loops, Infinite Loops, Nested Loops & Jump Statements
 * 
 * This program demonstrates:
 * - How infinite loops occur and how to avoid them
 * - For loop variations and advanced syntax
 * - Logical operators in loop conditions
 * - Nested loops for creating patterns
 * - Jump statements (break, continue) to control loop flow
 */
public class demo14 {
    // Different ways loops can become infinite and how they work

    public static void main(String[] args) {
        
        // ====== INFINITE LOOPS - COMMENTED OUT TO PREVENT HANGING ======
        // These examples show how loops can become infinite:
        
        // Example 1: While loop with no increment
        // Problem: i starts at 5, condition is i<10, but i is never incremented
        // Result: Loop runs forever because i always stays 5
        // int i = 5;
        // while(i<10){
        //     // i never changes, so condition always remains true
        // }
        // System.out.println(i);  // Never reaches here!

        // Example 2-5: For loop variations that create infinite loops
        
        // Infinite: Missing increment in for loop
        // for(int i=1; i<=10; ) {  // No i++ in increment section
        //     System.out.println(i);  // Prints 1 forever
        // }

        // Infinite: Empty condition means always true
        // for(int i=1; ; i++) {  // No condition = always true
        //     System.out.println(i);  // Prints 1, 2, 3, 4... forever
        // }

        // Infinite: Empty condition with only increment
        // for( ; ; i++) {  // No condition = always true
        //     System.out.println(i);  // Runs forever
        // }

        // Infinite: Completely empty for loop - hardest to spot!
        // for( ; ; ) {  // No initialization, condition, or increment
        //     System.out.println(i);  // Ultimate infinite loop!
        // }

        // ====== FOR LOOP - COMMA-SEPARATED VARIATIONS ======
        // The for loop allows multiple variable initializations and increments using commas
        // This is useful when you need to track multiple counters

        // Multiple variables in initialization section (comma-separated)
        // Multiple variables in increment section (comma-separated)
        // But: Condition section CANNOT use commas (must use logical operators like &&, ||)
        
        for(int num1 =1, num2 =1; num1<=10; num1++, num2+=2) {
            // Each iteration: num1 increments by 1, num2 increments by 2
            System.out.println(num1*num2);  // Prints: 1, 4, 9, 16, 25, 36, 49, 64, 81, 100
        }

        // ====== FOR LOOP CONDITIONS WITH LOGICAL OPERATORS ======
        // The condition section must be a single boolean expression
        // Use logical operators (&&, ||) to combine multiple checks
        
        for(int numm1 = 1, numm2 = 1; numm1<10 && numm2<5; numm1++, numm2++) {
            // Loop continues as long as BOTH conditions are true:
            // numm1 < 10 AND numm2 < 5
            // Once numm2 reaches 5, the condition fails and loop stops
            System.out.println(numm1*numm2);
            // Expected output:
            // 1*1 = 1
            // 2*2 = 4
            // 3*3 = 9
            // 4*4 = 16
            // (Loop stops here because numm2 is now 5, violating numm2<5)
        }

        // ====== FOR LOOP WITH BOOLEAN VARIABLE AS CONDITION ======
        // Loop conditions can also be simple boolean variables
        // This is useful for flag-controlled loops
        
        boolean b = true;
        for(int i = 1; b==true; i++) {
            System.out.println(i);  // Prints: 1
            b = false;              // After first iteration, b becomes false
            // Loop stops on second iteration because b is no longer true
        }

        // ====== WHY DO LOOPS USE INT MOSTLY? ======
        // Even though integers can be represented as: byte, short, int, long
        // Java loops predominantly use 'int' because:
        // - byte and short are automatically promoted to int in loop operations
        // - Type promotion happens during comparisons and arithmetic
        // Example: byte b = 5; b++; -> b is internally promoted to int for the ++ operation


        // ====== NESTED LOOPS - CREATING PATTERNS ======
        // A nested loop is a loop inside another loop
        // Outer loop controls rows, inner loop controls columns
        // 
        // This code creates a triangle pattern:
        // *
        // **
        // ***
        // ****
        // *****
        
        for(int head = 1; head<=5; head++) {  // Outer loop: 5 rows
            for(int tail = 1; tail<=head; tail++) {  // Inner loop: prints stars equal to row number
                System.out.print('*');  // Print star without newline
            }
            System.out.println();  // Move to next line after each row
        }

        // ====== JUMP STATEMENTS: BREAK & CONTINUE ======
        // These statements control loop flow without waiting for the condition to fail
        
        // Example 1: Using BREAK statement
        // Break immediately exits the innermost loop when condition is met
        
        for(int h = 1; h<=10; h++) {  // Outer loop: 10 iterations
            for(int t = 1; t<=10; t++) {  // Inner loop: 10 iterations
                if(h > 5) {  // When h exceeds 5...
                    break;   // ...exit the inner loop immediately
                }
                System.out.print("*");  // Print star
            }
            System.out.println();  // Move to next line
        }
        // Result: Only prints 5 rows of 10 stars each, then stops
        // Example 2: Using CONTINUE statement
        // Continue skips the current iteration and moves to the next one
        // It does NOT exit the loop (unlike break)
        
        for(int i1 = 1; i1<5; i1++) {  // Outer loop: rows 1-4
            for(int j1 = 1; j1<=5; j1++) {  // Inner loop: columns 1-5
                if(i1 == 3) {  // When we're on row 3...
                    continue;  // ...skip printing this row's stars
                }              // But the inner loop continues to next j1
                System.out.print('*');  // Print star
            }
            System.out.println();  // Move to next line
        }
        // Result: Prints 4 rows; row 3 is completely skipped (no stars printed)
    


        // print prime or not with break

        int numm = 17;

        int i2 ;
        for( i2 = 2;i2<numm;i2++){
            if(numm%i2 == 0){
                System.out.println("not prime");
                break;
            }
            
        }

        if(i2==numm){
            System.out.println("num is prime");
        }

    

       
    
    // contiue
   
    for(int i=1;i<=10;i++){
        if(i%2 !=0){
            continue;
        }
        System.out.println(i);
    }



    // outer inner labels

    outer:for(int start = 1;start<=10;start++){
        inner:for(int end = 1;end<=10;end++){

            System.out.print("*");
            if(start>5){
            break outer;
        }
    }
        System.out.println();
    }

    System.out.println();
    System.out.println();


     outer : for(int start = 1;start<=10;start++){
        inner : for(int end = 1;end<=start;end++){

            System.out.print("*");
            if(start==5){
            continue outer;
        }
    }
        System.out.println();
    }



    // code block in java

    first:{
        second:{
            third:{
                System.out.println("hello third");
                break first;
            }
      
        }
        
    }
     
}
    }





    
    
    
    
    

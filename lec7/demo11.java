package lec7;

/**
 * Demo11 - Demonstrates various conditional statements and control flow in Java
 * Topics covered:
 * - Simple if statements
 * - If-else statements
 * - Nested if statements
 * - If-else-if ladders
 * - Logical operators (&&, ||)
 * - Difference between multiple ifs vs if-else-if
 */
public class demo11 {

    public static void main(String[] args) {
        
        boolean b = true;

        // ====== SELECTION STATEMENTS (CONDITIONAL STATEMENTS) ======

        // ====== BASIC IF STATEMENT ======
        // Syntax: if(condition) { execute statement if condition is true }
        // If condition is false, the code block is skipped
        // Execution continues to the next statement after the if block

        int i=5;
        // Check if variable i equals 5
        if(i==5){
            System.out.println("i is 5 ");
        }

        // Code execution continues after the if block regardless of the condition
        System.out.println("continue the flow");
    



        // ====== IF-ELSE STATEMENT ======
        // If condition is true, execute the if block; otherwise execute the else block
        // Using logical operator && (AND): both conditions must be true
        if(i==5  && i<10){
            System.out.println("i is 5");
        }else{
            // else block executes only when the if condition is false
            System.out.println("i is not 5");
        }

        // ====== PRACTICAL EXAMPLE: ODD/EVEN CHECK ======
        int num = 4;
        // Check if number is even (num % 2 == 0) or odd
        if(num%2==0){
            System.out.println("num is even");
        }else{
            System.out.println("num is odd");
        }

        // ====== IF-ELSE WITHOUT BRACES ======
        // Optional: Omit curly braces {} if only one statement executes
        // Note: It's better practice to always use braces for readability
        int num2 = 5;
        // Single statement if-else without braces (compact syntax)
        if(num2==5) System.out.println("num is 5");
        else System.out.println("num is odd");

        // ====== NESTED IF STATEMENTS ======
        // An if statement inside another if statement
        // Note: Avoid deep nesting (usually max 2 levels) to keep code readable and avoid complexity
        if(i>5){
            if(i<10){
                System.out.println("i is 5");
            }
            else{
                System.out.println("i is greater than 10");
            }
        }
        else{
            System.out.println("i is less than 5");
        }

        // ====== USING LOGICAL OPERATORS (Alternative to Nesting) ======
        // More readable alternative: combine conditions with logical operators instead of nesting
        // && (AND): both conditions must be true
        if(i>5 && i<10){
            System.out.println("i is greater than 5 and less than 10");
        }

        // ====== IF-ELSE-IF LADDER ======
        // Multiple conditions checked in sequence
        // When one condition is true, its block executes and remaining conditions are skipped
        // Efficient when checking multiple conditions
        int i1 = 10; // Variable to test conditions
        // Checks conditions one by one; stops when one is true
        if(i1==5){
            System.out.println("i is 5");
        }
        else if(i1==6){
            System.out.println("i is 6");
        }
        else if(i1==7){
            System.out.println("i is 7");
        }
        else if(i1==8){
            System.out.println("i is 8");
        }
        else if(i1==9){
            System.out.println("i is 9");
        }
        else{
            // Default case if none of the above conditions match
            System.out.println("i is 10");
        }


        // ====== IMPORTANT: DIFFERENCE BETWEEN IF vs IF-ELSE-IF ======
        // Multiple IFs: All conditions are checked, multiple blocks can execute
        // IF-ELSE-IF: Conditions checked in order, only ONE block executes (most efficient)
        
        int age = 50;
        // APPROACH 1: Multiple independent IF statements
        // Problem: Multiple blocks can execute for the same variable (inefficient)
        // age=50, so conditions for age<80, age<60, age<40, age<25, age<18 are all true
        // ALL matching blocks will execute!
        if(age>80){
            System.out.println("you're very very old");
        }
         if(age<80 ){  // This will be true for age=50
            System.out.println("you're becoming  old");
        }
         if(age<60 ){  // This will also be true for age=50
            System.out.println("you're adult citizen");
        }
         if(age<40){   // This will also be true for age=50
            System.out.println("you're millenial");
        }
         if(age<25){   // This will also be true for age=50
            System.out.println("you're genz");
        }
         if(age<18){   // This will also be true for age=50
            System.out.println("you're genz alpha");
        }

        // APPROACH 2: IF-ELSE-IF ladder (BETTER APPROACH)
        // Advantage: Only ONE block executes, more efficient
        // Each condition is checked only if the previous one was false
        int agee = 45;
        if(agee>80){
            System.out.println("you're very very old");
        }
        else if(agee<80 && agee>60){  // Checks only if age <= 80
            System.out.println("you're becoming  old");
        }
        else if(agee<60 && agee>40){  // Checks only if age <= 60
            System.out.println("you're adult citizen");
        }
        else if(agee<40 && agee<25){  // Checks only if age <= 40
            System.out.println("you're millenial");
        }
        else if(agee<25 && agee<18){  // Checks only if age <= 25
            System.out.println("you're genz");
        }
        else {  // Default case for remaining conditions
            System.out.println("you're genz alpha");
        }
    }
    

}

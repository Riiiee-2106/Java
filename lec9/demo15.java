package lec9;

/**
 * Demo15 - Introduction to Arrays in Java
 * 
 * Arrays are used to store multiple values of the same data type
 * Key concepts covered:
 * - Array declaration and initialization
 * - Accessing array elements using index
 * - Array indexing (0-based)
 * - Iterating through arrays using loops
 * - Using .length property for dynamic loop control
 * - Different array declaration syntaxes
 */
public class demo15 {

    public static void main(String[] args) {
        
        // ====== ARRAY BASICS ======
        // Syntax: dataType[] arrayName = new dataType[size];
        // int[] rollNum = new int[5] creates an array that can hold 5 integer values
        // The array is indexed from 0 to 4 (5 elements total)
        // Initial values: By default, int array elements are initialized to 0
        
        int[] rollNum = new int[5];

        // ====== ACCESSING AND ASSIGNING ARRAY ELEMENTS ======
        // Use index (0-based) to access specific positions in the array
        // Syntax: arrayName[index] = value;
        // Valid indices for rollNum: 0, 1, 2, 3, 4
        // Accessing index 5 or beyond would cause ArrayIndexOutOfBoundsException
        
        rollNum[0] = 1;  // Store 1 at index 0
        rollNum[1] = 2;  // Store 2 at index 1
        rollNum[2] = 3;  // Store 3 at index 2
        rollNum[3] = 4;  // Store 4 at index 3
        rollNum[4] = 5;  // Store 5 at index 4

        // ====== PRINTING ARRAY ELEMENTS INDIVIDUALLY ======
        // Inefficient way: Print each element one by one
        // Problem: Not scalable for large arrays (imagine 1000 elements!)
        
        System.out.println(rollNum[0]);
        System.out.println(rollNum[1]);
        System.out.println(rollNum[2]);
        System.out.println(rollNum[3]);
        System.out.println(rollNum[4]);

        // ====== USING LOOPS WITH ARRAYS ======
        // Better approach: Use loops to work with arrays
        // Loops make code scalable and maintainable
        
        int[] rollNums = new int[3];  // Create array of size 3
        int x = 101;  // Starting value for assignment

        // Approach 1: Hardcoded loop with fixed size
        // Problem: If array size changes, we need to update the loop condition
        // This is NOT a good practice
        // for(int i=0; i<3; i++) {  // Hard-coded size
        //     rollNums[i] = x++;
        // }
        // for(int i=0; i<3; i++) {  // Hard-coded size again
        //     System.out.print(rollNums[i]+" ");
        // }

        // ====== USING .length PROPERTY (BEST PRACTICE) ======
        // The .length property automatically gives the array size
        // This makes code dynamic and scalable
        // If array size changes, the loop automatically adjusts
        // Syntax: arrayName.length (note: it's a property, not a method - no parentheses)
        
        // Populate array using loop
        // Each iteration: store x value, then increment x (x++)
        // First iteration: rollNums[0] = 101, x becomes 102
        // Second iteration: rollNums[1] = 102, x becomes 103
        // Third iteration: rollNums[2] = 103, x becomes 104
        for(int i=0; i<rollNums.length; i++) {
            rollNums[i] = x++;
        }

        // Print array elements using loop
        // This approach is much cleaner than printing each element individually
        for(int i=0; i<rollNums.length; i++) {
            System.out.print(rollNums[i]+" ");  // Print each element followed by space
        }

        // ====== ALTERNATIVE ARRAY DECLARATION SYNTAX ======
        // Both syntaxes are valid and equivalent:
        // int[] nums = new int[2];   // Recommended modern syntax
        // int nums[] = new int[2];   // Legacy/old syntax (still works)
        // 
        // Difference is stylistic - functionality is identical
        // Modern convention: Place [] with the data type, not the variable name
        
        int nums[] = new int[2];  // Legacy syntax - works but less recommended








    }
    
}

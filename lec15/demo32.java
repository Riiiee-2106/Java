package lec15;

public class demo32 {

    /*
     * String[] args - Command Line Arguments
     * 
     * String[] args is an array of Strings that receives command-line arguments
     * passed to the program when it is executed from the command line.
     * 
     * Example usage:
     *   java demo32 input.txt output.txt config.properties
     * 
     * In the above example:
     *   args[0] = "input.txt"
     *   args[1] = "output.txt"
     *   args[2] = "config.properties"
     *   args.length = 3
     * 
     * args is a zero-indexed array, so you access arguments using args[0], args[1], etc.
     * If no arguments are passed, args will be an empty array with length 0.
     * 
     * Use cases:
     *   - Pass file names or paths to the program
     *   - Pass configuration parameters
     *   - Pass input data without hardcoding values
     */

    public static void main(String[] args) {

        // args.length returns the total number of command-line arguments passed
        System.out.println("number of arguments "+ args.length);

        // Loop through each argument and print its index and value
        for(int i=0;i<args.length;i++){
            System.out.println("Argument "+i+ " = "+ args[i]);
        }
    }
    
}

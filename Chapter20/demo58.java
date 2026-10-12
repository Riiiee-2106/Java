package Chapter20;

import java.util.Scanner;

public class demo58 {
    

    public static void main(String[] args) {
        
        //scanner method

        Scanner sc = new Scanner(System.in);


        //string - all line code - nextLine()
        //single word - next()

        String name = sc.next();
        System.out.println(name);

        String sentence = sc.nextLine();
        System.out.println(sentence);


        //nextInt() -->integer
        // nextDouble() -->double
        // nextFloat() -->float
        //etc


        // scanner class is slow than bufferreader
        // scanner -- does tokenization,reg exp,type conversion
        //competitive prog - buffered reader
    }
}

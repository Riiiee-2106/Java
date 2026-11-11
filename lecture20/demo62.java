import java.io.IOException;


public class demo62 {

    public static void main(String[] args)throws IOException {
        //understanding input flow of java - 

        int x = System.in.read(); //this may throw exception so , we will learn later

        System.out.println((char)x);

        //read - reads one byte at a time

        // Aditya  --> A  aditya is giving only a as in return 

        //ditya --> stored in inputbuffer and then \n brings us to new line


        //[A][D][I][T][Y][A]
        //[65][100][105][116][121][97][10]


        //now when we do System.in.read() -> read one byte A - gives 65
    }

    
}


//A -> 65 -> binary form of 65
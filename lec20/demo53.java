package lec20;
import java.io.*;

public class demo53 {

    public static void main(String[] args)throws IOException {
        int x = System.in.read();
        System.out.println(x);

        // read () method by default return int  value


        System.out.println((char)(x));
        // read gives one byte read at a time 
        // so if given string --> it will read only first character

        // all the other bytes will be present in input buffer

        // input buffer 
        // Aditya is the string --> [A][D][I][T][Y][A] --->[67][100][105][116][121][97][10]

        // so if read() reads A[65] --> still [100][105][116][121][97][10]  will be present in inputbuffer



        // to call all characters through read one by one

        // very complicated code
        // character in java -->takes 2 bytes

        // but when we take ascii values -- it takes only 1 byte
        String s = "";
        int c  = 0;
        while(c !='\n'){
            c = System.in.read();
            s+=(char)c;
        }



        // as we dont want to do the above complicated code --- we have reader (abstract class)


        //buffered reader and inputstream reader and system.in(InputStream)

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


       String name =  br.readLine();
       System.out.println(name);



    //    Aditya (input)
    //OS buffer[67][100][105][116][121][97][10]
    // System.in (inputstream) -- recives bytes
    // InputstreamReader --> convert bytes into stream of character
    // Buffer reader ---> read chunk of characters --> store in java buffer
    // readLine() -->  string form from java buffer

    // Aditya(output)

    }
    
}

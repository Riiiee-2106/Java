package Chapter20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class demo56 {

    //how inputstreamreader used to convert bufferedreader to inputstream

    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
       String name = br.readLine();

       System.out.println(name);



       /*
       
       how it is working - 
        1. Aditya
        2.os buffer convert it to ascii 
        [65][100][105][116][121][97]
        3.System.in(InputStream) receives bytes
        4.InputStreamReader -->stream of bytes into stream of characters
        ('a','d','i','t','y','a')
        5. BufferedReader ---> readLine()--->Aditya--->name
        6.Aditya -->o/p
        
        */
        
    }
    
}

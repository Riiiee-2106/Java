import java.io.*;


public class demo63 {
    
    public static void main(String[] args)throws IOException{
        InputStreamReader isr  = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String name = br.readLine();
        System.out.println(name);



        
    }
}


/*
1. Aditya ->  i/p
2. [65][100][105][116][121][97] -->os buffer
3. System.in (InputStream ) recieves bytes
4. InputStreamReader -->stream of bytes into stream of characters
('A''d''i''t''y''a')
5.bufferedreader ->readline->Aditya->name
6.Aditya -> o/p */
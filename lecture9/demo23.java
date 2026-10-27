package lecture9;

public class demo23 {

    //1-dimensional array
    
    public static void main(String[] args) {
        
        // declaration of array - (java preferred)
        int[] rollNum = new int[3];

        // declaration in previous languages (c,c++ legacy)
        int rollNum2 [] = new int[3];

        // 101,102,103
        // input(manual)-

       /*  rollNum[0] = 101;
        rollNum[1] = 102;
        rollNum[2] = 103;

        // output(manual)-
        System.out.println(rollNum[0]);
        System.out.println(rollNum[1]);
        System.out.println(rollNum[2]);

        */

        // length of array
        System.out.println(rollNum.length);


         // 101,102,103
        // input(for loop)-
        int num = 101;
        for(int i=0;i<rollNum.length;i++){
           rollNum[i] = num++;
        }

        //output(for loop)-
        for(int i=0;i<rollNum.length;i++){
            System.out.println(rollNum[i]);
        }

    }
}

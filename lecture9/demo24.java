package lecture9;

public class demo24 {

    public static void main(String[] args) {
        
        // multi dimensional arrays

        // input - 
        int [][] marks = new int[3][3];

        marks[0][0] = 100;
        marks[0][1] = 99;
        marks[0][2] = 67;

        marks[1][0] = 87;
        marks[1][1] = 79;
        marks[1][2] = 76;

        marks[2][0] = 98;
        marks[2][1] = 87;
        marks[2][2] = 88;

        // output-
      /*  hardcoded- 
       for(int row=0;row<3;row++){
            for(int col = 0;col<3;col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }
*/


 for(int row=0;row<marks.length;row++){
            for(int col = 0;col<marks[row].length;col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }



        System.out.println("-------------------------");

        //jacked array
        /*
        1|2|3
        4|5
        6|7|8|9
         */

        int[][]mark = new int[3][];
        mark[0] = new int[3];
        mark[1] = new int[2];
        mark[2] = new int[4];


        mark[0][0] = 10;
        mark[0][1] = 45;
        mark[0][2] = 58;

        mark[1][0] = 56;
        mark[1][1] = 72;
        

        mark[2][0] = 81;
        mark[2][1] = 82;
        mark[2][2] = 85;
        mark[2][3] = 100;

        for(int row= 0;row<mark.length;row++){
            for(int col = 0;col<mark[row].length;col++){
                System.out.print(mark[row][col]+" ");
            }
            System.out.println();
        }



        // we can also declare and define the arrays as -

        System.out.println("----------------");

        int[] rollNumbers = {101,102,103};
        for(int i=0;i<rollNumbers.length;i++){
            System.out.print(rollNumbers[i]+" ");
        }System.out.println();


        System.out.println("----------------");

        int[][]markedStuMarks = {{20,30,40},
            {50,60,70},
            {80,90,100},
        };

         for(int row= 0;row<markedStuMarks.length;row++){
            for(int col = 0;col<markedStuMarks[row].length;col++){
                System.out.print(markedStuMarks[row][col]+" ");
            }
            System.out.println();
        }


    }
    
}

package lec9;

public class demo16 {
    public static void main(String[] args) {
        

        // 2d arrays -or - multidimensional arrays
        int[][]stuMarks = new int[3][3];

        stuMarks[0][0] = 1 ;
        stuMarks[0][1] = 2 ;
        stuMarks[0][2] = 3 ;

        stuMarks[1][0] = 4;
        stuMarks[1][1] = 5;
        stuMarks[1][2] = 6;

        stuMarks[2][0] = 7;
        stuMarks[2][1] = 8;
        stuMarks[2][2] = 9;



        // output
        // for(int i=0;i<3;i++){
        //     for(int j =0;j<3;j++){
        //         System.out.print(stuMarks[i][j]+" ");
        //     }
        //     System.out.println();
        // }


         for(int i=0;i<stuMarks.length;i++){
            for(int j =0;j<stuMarks[i].length;j++){
                System.out.print(stuMarks[i][j]+" ");
            }
            System.out.println();
        }


        int[][]marks = new int[3][]; //columns are optional


        marks[0] = new int[3];
        marks[1] = new int[2];
        marks[2] = new int[1];

        marks[0][0] = 101;
        marks[0][1] = 102;
        marks[0][2] = 103;


        marks[1][0] = 104;
        marks[1][1] = 105;

        marks[2][0] = 106;

        /* 
        [][][]
        [][]
        []
        */

        for(int row = 0;row<marks.length;row++){
            for(int col = 0;col<marks[row].length;col++){
                System.out.print(marks[row][col]+" ");
            }System.out.println();
        }



        // if values are already known 

        // 1d
        int[]arr = {1,3,5,7,9};

        // 2d
        int[][]array = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };



        // strings
        String firstName = "richa";
        String lastName = "Singh";
        System.out.println(firstName+" "+lastName);
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);


    }
    
}

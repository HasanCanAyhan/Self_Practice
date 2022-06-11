package day21_multiDimentionalArray.lessonQS;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {

        // Subject:  3D Array for contaning only 2DArrays   //  3D Array ---->>  2D Array ------>>> 1D Array ---->>> Elements

        // 2D Arrays
        int[][] arr2D1 = { {1,2}, {3,4,5}  }; // 2 one dimensional arr
        int[][] arr2D2 = { {6,7,8,9},{10,11},{12,13,14} }; // 3 one dimensional arr
        int[][] arr2D3 = { {15,16,17,18}  }; // 1 one dimensional  arr


        // arr3D : 3 (2D Arrays),    2D Arrays : 6 (1D Arrays)

        // indexOf2D arr :        0       1                0        1          2               0
        int[][][] arr3D = {   { {1,2}, {3,4,5}  } ,  { {6,7,8,9},{10,11},{12,13,14} } , { {15,16,17,18}  }  };

        // indexOf2D arr :          0                                  1                       2

        // [][][] means:
        //[indexOf 2D Arr][indexOf 1D Arr][indexOf Elements]


        System.out.println(    Arrays.deepToString(  arr3D   )  );
        // [[[1, 2], [3, 4, 5]], [[6, 7, 8, 9], [10, 11], [12, 13, 14]], [[15, 16, 17, 18]]]

        System.out.println(  Arrays.deepToString(    arr3D[1]        )      ); // 2D
        // [[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        System.out.println(     Arrays.toString(    arr3D[0][1]   )                     ); // 1D
        // [3, 4, 5]

        System.out.println(    arr3D[1][0][3]              ); // Element : 9

        System.out.println(     arr3D[1][2][2]            ); // Element : 14

        System.out.println("-------------------------------------------------------");

        // Iterating

        // it must be 3 loop

        for (int i = 0; i < arr3D.length; i++) { // i : index of 2D Arrays

            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // j :index of 1D Arrays

                int[] each1DArray = each2DArray[j];
                System.out.println( Arrays.toString(each1DArray));


                for (int k = 0; k < each1DArray.length; k++) { // k : index of each elements

                    int eachElements = each1DArray[k];
                    System.out.println(eachElements);

                }


            }


        }


    }


}

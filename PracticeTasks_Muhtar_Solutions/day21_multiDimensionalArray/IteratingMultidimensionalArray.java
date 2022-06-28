package PracticeTasks_Muhtar_Solutions.day21_multiDimensionalArray;

public class IteratingMultidimensionalArray {

    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};


        for (String[][][][][][][][][] arr9D : array) {
            for (String[][][][][][][][] arr8D : arr9D) {
                for (String[][][][][][][] arr7D : arr8D) {
                    for (String[][][][][][] arr6D : arr7D) {
                        for (String[][][][][] arr5D : arr6D) {
                            for (String[][][][] arr4D : arr5D) {
                                for (String[][][] arr3D : arr4D) {
                                    for (String[][] arr2D : arr3D) {
                                        for (String[] arr1D : arr2D) {
                                            for (String each : arr1D) {
                                                System.out.print(each + " ");
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }

}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};
	 Write a program that can dispay each elements of the given array
 */
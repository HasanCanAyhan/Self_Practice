package day21_multiDimentionalArray.practiceTasks;

public class TenDimensionalArray {

    public static void main(String[] args) {

        String[][][][][][][][][][] array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        // for 10D arrays it must be 10 for loop


        for (String[][][][][][][][][] each9DArr : array) {
            for (String[][][][][][][][] each8DArr : each9DArr) {
                for (String[][][][][][][] each7DArr : each8DArr) {
                    for (String[][][][][][] each6DArr : each7DArr) {
                        for (String[][][][][] each5DArr : each6DArr) {
                            for (String[][][][] each4DArr : each5DArr) {
                                for (String[][][] each3DArr : each4DArr) {
                                    for (String[][] each2DArr : each3DArr) {
                                        for (String[] each1DArr : each2DArr) {
                                            for (String eachElement : each1DArr) {
                                                System.out.println(eachElement);
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


        /* OUTPUT:
        I
        Love
        Arrays


         */


    }

}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can dispay each elements of the given array
 */
